package edu.jalc.inclass.order;

import java.io.*;
import java.util.*;

public class Order{

   private Item[] items;
   private double itemTotal = 0;
   private double discountTotal = 0;
   private double afterTaxTotal = 0;
   private double discount = 0;

   public Order(){
      items = new Item[0];
   }

   public static void main(String... args)throws Exception{

      if (args.length < 1){
         throw new Exception("no order file provided");
      }

      for(int i = 0; i < args.length; i++){
         try{
            Order order = new Order();
            order.readFile(args[i]);
            order.computeTotal();
            order.printOrder(i);
         }catch(IOException e){
            System.err.println("file not found");
            //e.printStackTrace();
         }catch(NumberFormatException e){
            System.err.println("incorrect number format");
         }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("not enough arguements");
         }
      }
   }

   private void readFile(String filename)throws Exception{

      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      inputFile.nextLine();//the header

      while(inputFile.hasNext()){
         String itemString = inputFile.nextLine();
         String[] split = itemString.split(",");
         String name = split[0];
         double price = Double.valueOf(split[1]);
         int quantity = Integer.valueOf(split[2]);
         if(name.toLowerCase().contains("discount")){
            discount = price;
         }
         else{
            addItem(new Item(name,price,quantity));
         }
      }
   }

   private void addItem(Item item){
      items = Arrays.copyOf(items,items.length+1);
      items[items.length-1] = item;
   }

   private void computeTotal(){

      for(int i = 0; i < items.length; i++){
         itemTotal += (items[i].getTotal());
      }

      discountTotal = itemTotal;
      discountTotal *= (1 - discount);
      afterTaxTotal = discountTotal*1.05;
   }

   private void printOrder(int orderNumber){

      System.out.printf("Order Number %d:\n",orderNumber + 1);

      for(Item item : items){
         System.out.printf("%12s: %d @ $%.2f \t $%.2f\n",
         item.getName(),item.getQuantity(),item.getPrice(),item.getTotal());
      }

      if(discount != 0){
         System.out.printf("Discount: %f%s\t\t-$%.2f\n",discount,"%",itemTotal*discount);
      }
      System.out.printf("Pre-Tax Total:\t\t\t $%.2f\n",discountTotal);
      System.out.printf("After-Tax Total:\t\t $%.2f\n\n",afterTaxTotal);
   }
}

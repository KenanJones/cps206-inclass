public class Calculator{
   
   static String command;
   static double x;
   static double y;
   static double result;
   
   public static void main (String... args)throws Exception{
      if(args.length > 0){
         command = args[0];
         verifyInput(args);
         System.out.println("when you " + command + " " + x + " and " + y +
            "\nThe result is " + result);
      }
      else{
      System.out.println("command needed!");
      throw new Exception("command needed");
      }
   }
   
   public static void verifyInput(String[] input)throws Exception{
      try{
         x = Double.parseDouble(input[1]);
         y = Double.parseDouble(input[2]);
      }
      catch(NumberFormatException e){
         System.out.println("incorrect number format!");
         throw new Exception("incorrect number format");
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("not enough arguments!");
         throw new Exception("not enough arguments");
      }
      switch(command.toLowerCase()){
         case "a":
         case "add": result = x + y; command = "add"; break;
         case "d":
         case "divide": result = divide(); command = "divide"; break;
         case "m":
         case "multiply": result = x * y; command = "multiply"; break;
         case "s":
         case "subtract": result = x - y; command = "subtract"; break;
         default: System.out.println("invalid command!");
            throw new Exception("invalid command");
      }
   }
   
   public static double divide()throws Exception{
      if(y == 0){
         throw new Exception("division by zero is not allowed");
         //System.out.println("division by zero is not allowed!");
         //System.exit(1);
      }
   return x / y;
   }
}

package edu.jalc.inclass.inheritance.bottles;

class BottleDriver{
  public static void main(String... args){
    Bottle sb = new SodaBottle(10,new Soda());
    Bottle bb = new BeerBottle(1, new Beer());
    Bottle wb = new WaterBottle(1000, new Water());
    System.out.println(sb);
  }
}

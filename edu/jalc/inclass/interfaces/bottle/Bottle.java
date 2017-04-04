package edu.jalc.inclass.interfaces.bottle;

class Bottle implements Pourable, Fillable{

  private double contentVolume = 10;
  private final double volume = 32;

  public Bottle(double amount){
    this.contentVolume = amount;
  }

  public static void main(String... args){
    Bottle b = new Bottle(1.4);
    System.out.println(b);
    b.fill();
    System.out.println(b);
    b.pour();
    System.out.println(b);
    b.pour(3.2);
    System.out.println(b);
    b.fill(6.8);
    System.out.println(b);
    Fillable bottle = new Bottle(0.55);
    System.out.println(bottle);
    bottle.fill();
    System.out.println(bottle);
  }

  public void pour(){
    contentVolume --;
  }
  public void pour(double amount){
    contentVolume -= amount;
  }
  public void fill(){
    contentVolume = volume;
  }
  public void fill(double amount){
    contentVolume += amount;
    if (contentVolume > volume) contentVolume = volume;
  }

  public double getVolume(){return this.volume;}
  public double getContentVolume(){return this.contentVolume;}

  public String toString(){
    return String.format("bottle with %f in it", contentVolume);
  }
}

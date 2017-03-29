package edu.jalc.inclass.interfaces;

class Bottle implements Pourable{

  public double contentVolume = 10;

  public Bottle(double amount){
    this.contentVolume = amount;
  }

  public static void main(String... args){
    Bottle b = new Bottle(10);
    System.out.println(b);
    b.pour();
    System.out.println(b);
    b.pour(3.2);
    System.out.println(b);
  }

  public void pour(){
    contentVolume --;
  }
  public void pour(double amount){
    contentVolume -= amount;
  }

  public String toString(){
    return String.format("bottle with %f in it", contentVolume);
  }
}

package edu.jalc.inclass.interfaces;

class Rain implements Pourable{

  public static void main(String... args){
    Pourable rain = new Rain();
    rain.pour();
    rain.pour(3);
  }

  public void pour(){
    System.out.println("it's raining,\nit's pouring!");
  }
  public void pour(double amount){
    this.pour();
  }
}

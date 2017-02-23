package edu.jalc.inclass.inheritance.bottles;

abstract class Bottle{
  private double capacity;

  public Bottle(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity(){
    return capacity;
  }
}

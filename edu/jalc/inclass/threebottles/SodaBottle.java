package edu.jalc.inclass.threebottles;

class SodaBottle extends Bottle{
  private double capacity;
  private Soda soda;

  public SodaBottle(double capacity, Soda soda){
    super(capacity);
    this.soda = soda;
  }

  public Soda getSoda(){
    return soda;
  }

  public String toString(){
    return super.getCapacity() + soda.toString();
  }
}

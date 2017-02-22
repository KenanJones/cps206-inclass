package edu.jalc.inclass.threebottles;

class WaterBottle extends Bottle{
  private Water water;

  public WaterBottle(double capacity, Water water){
    super(capacity);
    this.water = water;
  }

  public Water getWater(){
    return water;
  }

  public String toString(){
    return super.getCapacity() + water.toString();
  }
}

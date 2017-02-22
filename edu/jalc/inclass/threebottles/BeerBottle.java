package edu.jalc.inclass.threebottles;

class BeerBottle extends Bottle{
  private double capacity;
  private Beer beer;

  public BeerBottle(double capacity, Beer beer){
    super(capacity);
    this.beer = beer;
  }

  public Beer getBeer(){
    return beer;
  }

  public String toString(){
    return super.getCapacity() + beer.toString();
  }
}

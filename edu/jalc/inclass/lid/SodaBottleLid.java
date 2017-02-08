package edu.jalc.inclass.lid;

public class SodaBottleLid{

  private final double height;
  private boolean attached;

  private SodaBottleLid(){
    height = 0;
    setAttached(false);
  }

  public SodaBottleLid(double height, boolean attached){
    this.height = height;
    setAttached(attached);
  }

  public void setAttached(boolean attached){
    this.attached = attached;
  }

  public void attach(){
    setAttached(true);
  }

  public void detach(){
    setAttached(false);
  }
}

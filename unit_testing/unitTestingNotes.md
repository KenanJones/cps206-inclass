#Unit Testing
###02-03-17
using methods to solve problems.
breaking methods down into units of work.
testing units of work.
```java
public class Car{
  drive(){
    /*putSeatBeltOn()
    startCar()
    putInGear()
    accelerate()
    turn()
    brake()*/
  }
  putSeatBeltOn(){
    grabSeatBelt();
    clickItOrTicket();
  }
  startCar(){
    checkSourceOfIgnition();
    if(key)startKeyCar();
    else startFobCar();
  }
  startKeyCar(){
      putIntoIgnition();
      turnKey();
      if(carb)pressGas();
  }
  startFobCar(){
    pushButton();
  }
  putInGear(){
    if(manual)shiftManual();
    else shiftAuto();
  }
  shiftManual(){
    pressClutch();//workClutch(true)
    moveGearShift();
    releaseClutch();//workClutch(false)
  }
  workClutch(boolean press){
    if(press)//do steps to press; isClutchPressed = true;
    else //do steps to release; isClutchPressed = false;
  }
  moveGearShift(int gear){}
}
```
be very declarative in main and large methods.
```java
void testWorkClutch(){
  workClutch(true);
  assert (isClutchPressed);
  workClutch(false);
  assert (! isClutchPressed);
}
```
write a main method which calls the test[methodName] methods in either a driver or the class' main method.
remember to use java -ea [testClassName]

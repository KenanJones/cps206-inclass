package edu.jalc.inclass.interfaces.example;

public class Example implements Optional, Mysterious{
  private Optional optional;

  public Example(){

  }
  public Example(Optional optional){
    this.optional = optional;
  }

  public void doOptional(){
    if (optional != null) optional.doOptional();
    else System.out.println("Default behavior option");
  }

  public void doMysterious(Injectable injectable){
    //System.out.println("This is mysterious!");
    injectable.doInjectableMethod();
  }
}

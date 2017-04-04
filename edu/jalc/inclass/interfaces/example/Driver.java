package edu.jalc.inclass.interfaces.example;

public class Driver{
  public static void main(String... args){
    Example ex = new Example();
    ex.doOptional();
    ex.doMysterious(() -> System.out.println("an injectable behavior"));
    ex = new Example(() -> System.out.println("an optional behavior"));
    ex.doOptional();
    ex.doMysterious(() -> System.out.println("another injectable behavior"));
  }
}

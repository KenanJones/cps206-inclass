public class Dog{
  public String name;
  public Dog(String name){
    this.name = name;
  }
  public boolean equals(Object other){
    Dog dog = (Dog)other;
    return this.name.equals(dog.name);
  }

  public String toString(){
    return "my name is " + this.name;
  }

  public int hashCode(){
    return super.hashCode()%31;
  }
}

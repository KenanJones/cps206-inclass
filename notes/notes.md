#Notes
git clone "address"
git add .
git commit -am "comments"
git push
##week:
better notes
exceptions
recursion
generics / iterators
java 8 API
uml
unit testing
###01-30-17

always throw an exception unless you are in a driver
  ```java
  class Example{
     public String methodName(String string){
       if(string == null) throw new NullPointerException();
     }
  }
  ```
###01-31-17
arraylist uses "nodes"
node has method next and data of any type
  ```java
  <E extends Shape> //shape and subclasses
  <? super Integer> //integer and superclasses
  <E extends Comparable<? super E>>
  //for example, E is type string:
  //E can only be Comparable or String
  ```
###02-01-17

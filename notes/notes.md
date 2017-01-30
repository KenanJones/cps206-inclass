#Notes
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

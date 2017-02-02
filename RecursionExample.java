public class RecursionExample{
   int factorial = 1;

   public static void main(String... args){
      RecursionExample recursion = new RecursionExample();
      System.out.println(recursion.doFactorial(6));
   }

   public int doFactorial(int n){
     if(n > 1){
        factorial *= n;
        n--;
        doFactorial(n);
     }
     return factorial;
   }
}

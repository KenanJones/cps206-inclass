public class RecursionExample{
   int factorial = 1;

   public static void main(String... args){
      RecursionExample recursion = new RecursionExample();
      System.out.println(recursion.doFactorial(4));
      System.out.println(recursion.doSums(11));
   }

   public int doFactorial(int n){
     /*if(n > 1){
        factorial *= n;
        n--;
        doFactorial(n);
     }*/
     if(n == 1) return 1;
     else return n*doFactorial(n-1);
   }

   public int doSums(int n){
      return (n*n+n)/2;
   }
}

public class RecursionExample{
   int factorial = 1;

   public static void main(String... args){
      RecursionExample recursion = new RecursionExample();
      System.out.println(recursion.doFactorial(4));
      System.out.println(recursion.doSum(11));
      System.out.println(recursion.doSum(10,14));
   }

   public int doFactorial(int n){
     if(n == 1) return 1;
     else return n*doFactorial(n-1);
   }

   public int doSum(int n){
      return (n*n+n)/2;
   }

   public int doSum(int start, int end){
      return doSum(end)-doSum(start);
   }
}

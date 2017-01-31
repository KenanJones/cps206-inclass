import java.util.*;
public class Stuff{
   public static void main(String... args){
      ArrayList<String> list = new ArrayList<>();
      System.out.println(list.size());
      list.add("kenan");
      list.add("nick");
      list.add("william");
      System.out.println(list);
      list.add(0,"names:");
      System.out.println(list);
      System.out.println(list.contains("kulis"));
      String n = "names:";
      System.out.println(list.contains(n));
   }
}

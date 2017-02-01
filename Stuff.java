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

      Iterator<String> iterator = list.iterator();
      while(iterator.hasNext()){
         System.out.println(iterator.next());
      }

      ArrayList<ArrayList<String>> list2D = new ArrayList<>();
      list2D.add(new ArrayList<>());
      list2D.get(0).add("something");

      //this is a better alternative
      ArrayList<String>[] lists = new ArrayList[10];
      System.out.println(lists.length);
      System.out.println(lists[0].size());
   }
}

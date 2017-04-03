package edu.jalc.inclass.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverLambda{
  static int count = 0;
  public static void main(String... args){

    ArrayList<Thread> threads = new ArrayList<>();

    for(int i = 0; i < 10; i++){
      threads.add(new Thread(() -> {
        int myNumber = count;
        count++;
        try{
          Thread.sleep((int) (Math.random() * 10000));
          System.out.println("Thread-" + myNumber + " running");
        } catch (Exception e){
          System.out.println("Thread-" + myNumber + " interrupted");
        }
      }));
    }
    System.out.println(threads);
    //this is scalable
    threads.stream().forEach((thread) -> thread.start());
    threads.sort((a, b) -> b.getName().compareTo(a.getName()));
    List<String> names = threads.stream()
            .map((thread) -> thread.getName())
            .collect(Collectors.toList());

    //this is not expandable
    List<String> namesSlow = new ArrayList<>();
    for(Thread thread : threads){
      if(!thread.getName().equals("thread-0"))continue;
      //do something
    }
    System.out.println(threads);
  }
}

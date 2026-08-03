package day5;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
         ArrayList<String> fruits = new ArrayList<>();

         fruits.add("kiwi");
         fruits.add("papaya");
         fruits.add("grapes");
         fruits.add("blueberry");
         fruits.add("plum");

         for (String x : fruits){
            System.out.println(x);
         }

         fruits.remove(2);
         System.out.println(fruits);

         System.out.println("does the list contain apple?:");
         fruits.contains("apple");

         System.out.println(fruits.size());
    }
   
}

package day6;

import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
    HashMap<String,Integer> students = new HashMap<>();
    students.put("chintu",90);
    students.put("kireon",90);
    students.put("sam",90);
    students.put("aman",90);
    students.put("lingesan",90);

    System.out.println("key: "+ students.keySet());
    System.out.println("values: "+ students.values());
    System.out.println("does it contain lingesan?: "+ students.containsKey("lingesan"));
    students.remove("kireon");
    System.out.println("size: "+ students.size());

    }

}
   
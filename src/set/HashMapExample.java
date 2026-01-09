package set;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1,"one");
    map.put(2,"two");
    map.put(3,"three");
    map.put(4,"four");
    System.out.println("HashMap:"+ map);
    // Accessing Values
    System.out.println("Contains value 'one': " + map.containsValue("one"));    
    for(int i: map.keySet()) {
        System.out.println("Original Hashmap"+"Key: " + i + ", Value: " + map.get(i));

    }
    map.put(null, "King");
    map.remove(2);
    map.put(5,"five");
    map.remove(5,"five");
    System.out.println("Updated HashMap:"+ map);
    map.
    

    // }
    
    }
    

}

package set;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
         SortedMap<Integer, String> map = new TreeMap<>();
        map.put(91,"Mohit");
        map.put(98,"Awej");
        map.put(78, "Vipul");
        map.put(77, "Bruce");

        System.out.println(map);
        System.out.println(map.firstKey()); // lowest key
        System.out.println(map.lastKey());  // highest key
        System.out.println(map.headMap(91));// 91 excluded
        System.out.println(map.tailMap(91)); // 91 included
        System.out.println(map.subMap(77, 91)); // 77 included, 91 excluded

        System.out.println("------------------Navigable Hashmap Below -----------------------");        
        NavigableMap<Integer, String> navMap = new TreeMap<>();
        navMap.put(1, "ONE");
        navMap.put(2, "TWO");
        navMap.put(3, "THREE");
        System.out.println("Navigable Map: "+navMap);
        System.out.println(navMap.lowerKey(2));
        System.out.println(navMap.ceilingKey(2));
        System.out.println(navMap.floorKey(1));
        System.out.println(navMap.higherKey(1));
        System.out.println(navMap.descendingKeySet());
    }

}

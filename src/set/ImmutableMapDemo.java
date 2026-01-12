package set;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

    // Contains some errors this code is for demo purpose only
    public static void main(String[] args) {
       Map<String, Integer> map = new HashMap<>();
       map.put("one",1);
       map.put("two",2);
       map.put("three",3);

       Map<String, Integer> map2 = Collections.unmodifiableMap(map);
         System.out.println(map2);
        
        Map<String, Integer> map3 = Map.of("Sunday",1, "Monday",2, "Tuesday",3);
        map3.put("Wednesday",4); 
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("April",4), Map.entry("may",5));
    }
}

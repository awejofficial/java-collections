package set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true); // double LinkedList , That Stores Entries Uses When The Order Matter The Most
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Grapes", 14);
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Grapes");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Grapes");
        linkedHashMap.get("Apple");
        
        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
        HashMap<String, Integer> hash = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashmap2 = new LinkedHashMap<>(hash);
        hash.put("a",1);
        hash.put("b", 2);
        hash.put("c",3);

        Integer res = hash.getOrDefault("a",0); //  
        System.out.println("\n ----------Space---------\n"+res);

        
        
    }

}
//cashing eviction stratergy to remove the least recently used element
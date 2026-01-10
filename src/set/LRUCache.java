package set;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V>  {
    
    private int capacity;



    private LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }



    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size()> capacity;
    }



    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(2);
        studentMap.put("Alice",86);
        studentMap.put("Bruce",76);
        studentMap.put("Alice",80);
        studentMap.put("Awej",99);
        studentMap.put("Bruce",100);
        System.out.println(studentMap);        
        
        
    }

}

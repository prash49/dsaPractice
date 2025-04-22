package DSAProblems.interviewPrep.dsaMostAsked;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private  final int  capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        //defining a cache with size 3
        cache.put(1, "One");
        cache.put(2, "two");
        cache.put(3, "three");
        System.out.println("cache content:"+ cache);

        // access elements
        cache.get(1);
        //here we used 1 to check and 3 is recently added hence 2 has to evict when u put other aata
        cache.put(4,"fourrrr");

        System.out.println("after adding new element to the cache :"+cache );
        cache.put(5,"five");
        System.out.println("cache eviction after 5"+ cache);

    }
}

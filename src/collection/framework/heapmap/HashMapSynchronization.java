package collection.framework.heapmap;

/**
 * Created by neelabhsingh on 04/10/16.
 */
import java.util.*;
public class HashMapSynchronization {
    public static void main(String [] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Java");
        map.put("2", "C++");
        map.put("3", "Python");
        Map<String, String> sysnMap = Collections.synchronizedMap(map);
        System.out.println("Synchronize map"+ sysnMap);
    }
}

package collection.framework.iterator;

/**
 * Created by neelabhsingh on 03/10/16.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FailFastDemo {
    public static void main(String [] args){
        Map<Integer,String> hashMap =new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");
        hashMap.put(4, "C");
        hashMap.put(5, "ROR");
        Iterator itr = hashMap.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(hashMap.get(itr.next()));
            hashMap.put(6, "Basic");// This will throw Exception java.util.ConcurrentModificationException
        }
    }
}

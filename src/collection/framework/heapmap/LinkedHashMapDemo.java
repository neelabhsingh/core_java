package collection.framework.heapmap;

/**
 * Created by neelabhsingh on 10/10/16.
 */
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String [] args){
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
        lhm.put("Zara", new Double(3434.34));
        lhm.put("Mahnaz", new Double(123.22));
        lhm.put("Ayan", new Double(1378.00));
        lhm.put("Daisy", new Double(99.22));
        lhm.put("Qadir", new Double(-19.08));
        Set set = lhm.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            System.out.print("Key ="+ me.getKey() + "Value ="+ me.getValue());
        }
    }
}

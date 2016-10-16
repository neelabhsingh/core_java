package collection.framework.sortedmap;

/**
 * Created by neelabhsingh on 08/10/16.
 */
import java.util.*;
public class SortedMapDemo {
    public static void main(String [] args){
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        treeMap.put("Zera", new Double(82918.12));
        treeMap.put("Mahnaz", new Double(828.12));
        treeMap.put("Ayan", new Double(28.12));
        treeMap.put("Daisy", new Double(218.12));
        treeMap.put("Qadir", new Double(23.34));
        Set set = treeMap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            System.out.println("Key="+ me.getKey() +"Value="+me.getValue());
        }
    }
}

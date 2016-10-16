package collection.framework.sortedset;

/**
 * Created by neelabhsingh on 08/10/16.
 */
import java.util.*;
public class SortedSetTest {
    public static void main(String [] args){
        SortedSet<String> ss = new TreeSet<String>();
        ss.add("AA");
        ss.add("AC");
        ss.add("AB");
        Iterator itr = ss.iterator();
        System.out.print("Sorted Set: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
        System.out.println("First element in sorted set: "+ ss.first());
        System.out.println("Last element in sorted set: "+ ss.last());
    }
}

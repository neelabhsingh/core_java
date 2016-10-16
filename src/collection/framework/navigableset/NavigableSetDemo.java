package collection.framework.navigableset;

/**
 * Created by neelabhsingh on 08/10/16.
 */
import java.util.*;
public class NavigableSetDemo {
    public static void main(String [] args){
        NavigableSet<Integer> nset = new TreeSet<Integer>();
        nset.add(1);
        nset.add(5);
        nset.add(2);
        nset.add(6);
        nset.add(3);
        nset.add(4);
        NavigableSet<Integer> resOrder = nset.descendingSet();
        System.out.println("Normal order: " + nset);
        System.out.println("Reverse order: " + resOrder);
    }
}

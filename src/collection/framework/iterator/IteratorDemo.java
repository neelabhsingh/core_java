package collection.framework.iterator;

import java.util.*;

/**
 * Created by neelabhsingh on 08/10/16.
 */
public class IteratorDemo {
    public static void main(String [] args){
        Set<String> set= new HashSet<String>();
        //set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() +" ");
        }
    }
}

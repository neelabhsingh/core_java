package collection.framework.collection.linkedlist;

/**
 * Created by neelabhsingh on 24/10/16.
 */
import java.util.*;
public class DescendingIterator {
    public static void main(String [] args){
        LinkedList ll = new LinkedList();
        ll.add("AA");
        ll.add("BB");
        ll.add("CC");
        ll.add("DD");
        Iterator itr = ll.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

package collection.framework.iterator;

import java.util.*;

/**
 * Created by neelabhsingh on 08/10/16.
 */
public class ListIteratorDemo {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        ListIterator listItr = list.listIterator();
        System.out.println("List Iterator in List using Previous");
        while (listItr.hasPrevious()){
            System.out.print(listItr.previous() + " "); // Nothing will print
        }

        System.out.println("List Iterator in List using next");
        while (listItr.hasNext()){
            System.out.print(listItr);
        }
        while (listItr.hasPrevious()){
            System.out.print(listItr.previous() + " ");
        }
        List<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        System.out.println("List Iterator in LinkedList");
        ListIterator listItr1= ll.listIterator();
        while(listItr1.hasNext()){
            System.out.print(listItr1.next());
        }
    }
}

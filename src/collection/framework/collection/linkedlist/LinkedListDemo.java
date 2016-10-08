package collection.framework.collection.linkedlist;

/**
 * Created by neelabhsingh on 08/10/16.
 */
import java.util.*;
public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator itr = list.iterator();
        System.out.println("Iteration");
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        Iterator revItr = list.descendingIterator();

        System.out.println();
        System.out.println("Reverse Iteration");
        while (revItr.hasNext()){
            System.out.print(revItr.next() + " ");
        }
    }
}

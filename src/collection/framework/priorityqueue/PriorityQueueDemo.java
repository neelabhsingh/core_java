package collection.framework.priorityqueue;

/**
 * Created by neelabhsingh on 10/10/16.
 */
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String [] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(1);
        pq.add(5);
        pq.add(1);
        System.out.println ( "Priority queue values are: "+ pq);
        Comparator comp = pq.comparator();
        System.out.println ( "Priority queue values are: "+ comp);
    }
}

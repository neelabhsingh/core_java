package collection.framework.collectionsclass;

/**
 * Created by neelabhsingh on 10/10/16.
 */
import java.util.*;
public class SortListDemo {
    public static void main(String [] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        Collections.sort(fruits);
        Iterator itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nSort List in Descending Order");
        Collections.sort(fruits, Collections.reverseOrder());
        for(String fruit: fruits){
            System.out.print(fruit+ " ");
        }
        System.out.println("\nSort In Ascending Order");
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String fruit: fruits){
            System.out.print(fruit+ " ");
        }
        System.out.println("\nSort In Descending Order");
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(String fruit: fruits){
            System.out.print(fruit+ " ");
        }
    }
}

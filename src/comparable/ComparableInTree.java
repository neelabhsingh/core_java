package comparable;
import java.util.*;
/**
 * Created by neelabhsingh on 05/11/16.
 */
public class ComparableInTree {
    public static void main(String [] args){
        TreeSet<Dog> d = new TreeSet<Dog>();
        d.add(new Dog(3));
        d.add(new Dog(2));
        d.add(new Dog(1));
        d.add(new Dog(4));
        Iterator itr = d.iterator();
        while(itr.hasNext()){
            System.out.print(((Dog)itr.next()).size+" ");
        }
    }
}

class Dog implements Comparable<Dog>{
    int size;
    Dog(int size){
        this.size = size;
    }
    @Override
    public int compareTo(Dog obj){
        //Ascending Order
        return this.size - obj.size;
    }
}
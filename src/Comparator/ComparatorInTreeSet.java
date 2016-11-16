package Comparator;
import java.util.*;
/**
 * Created by neelabhsingh on 05/11/16.
 */
public class ComparatorInTreeSet {
    public static void main(String [] args){
        TreeSet<Dog> d = new TreeSet<Dog>(new SizeComparable());
        d.add(new Dog("A", 3));
        d.add(new Dog("B", 2));
        d.add(new Dog("C", 1));
        d.add(new Dog("D", 4));
        Iterator itr = d.iterator();
        while(itr.hasNext()){
            System.out.print(((Dog)itr.next()).getSize()+" ");
        }
    }
}

class Dog{
    private String dogName;
    private int size;
    public Dog(String dogName, int size){
        this.dogName = dogName;
        this.size = size;
    }
    public String getDogName(){
        return dogName;
    }
    public int getSize(){
        return size;
    }
    public void setDogName(String dogName){
        this.dogName =dogName;
    }
    public void setSize(int size){
        this.size = size;
    }
}
class SizeComparable implements Comparator<Dog>{
    @Override
    public int compare(Dog dogObj1, Dog dogObj2){
        return dogObj1.getSize() - dogObj2.getSize();
    }

}
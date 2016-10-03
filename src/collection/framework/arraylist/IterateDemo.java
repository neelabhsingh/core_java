package collection.framework.arraylist;

/**
 * Created by neelabhsingh on 03/10/16.
 */
import java.util.*;
public class IterateDemo {
    public static void main(String [] args){
        ArrayList<String> languageList = new ArrayList<String>();
        languageList.add("Python");
        languageList.add("Java");
        languageList.add("C++");
        languageList.add("C");
        languageList.add("RoR");
        Iterator itr = languageList.iterator();
        //Scan through Iterator
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Scan through for loop
        System.out.println("For loop demo");
        for(String obj: languageList){
            System.out.println(obj);
        }
    }
}

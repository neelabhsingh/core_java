package collection.framework.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
/**
 * Created by neelabhsingh on 13/10/16.
 */
public class StringComparableDemo {
    public static void main(String [] args){
        String str1 = "Strings are immutable";
        String str2 = new String("Integers are not immutable");
        String str3 = new String("Strings are immutable");
        ArrayList<String> array = new ArrayList<>();
        array.add(str1);
        array.add(str2);
        array.add(str3);
        Collections.sort(array);
        //Arrays.sort(array);
        Iterator itr = array.iterator();
        while (itr.hasNext()){
            System.out.print("After Sorting : "+ itr.next()+" ");
        }

    }
}

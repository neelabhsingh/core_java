package collection.framework.heapmap;

import java.util.*;

/**
 * Created by neelabhsingh on 24/10/16.
 */
public class HashMapMethods {
    public static void main(String [] args){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("tutorials", 1);
        hashMap.put("point", 2);
        hashMap.put("is best", 3);
        Set keySet = hashMap.keySet();
        Iterator<String> itr = keySet.iterator();
        while(itr.hasNext()){
            Object objKey = itr.next();
            //If Iterator type is not define, following line will give error
            //Error:(18, 35) java: incompatible types: java.lang.Object cannot be converted to java.lang.String
            String key1 = itr.next();
            String key = (String) objKey;
//            if(objKey instanceof String){
//                System.out.print("Downcasting");
//            }
            System.out.println("Key: "+key+", "+"Value "+ hashMap.get(key));
        }
    }
}

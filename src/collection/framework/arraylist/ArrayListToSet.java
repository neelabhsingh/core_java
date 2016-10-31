package collection.framework.arraylist;

/**
 * Created by neelabhsingh on 25/10/16.
 */
import java.util.*;
public class ArrayListToSet {
    public static void main(String [] args){
        //int [] array = {1, 3, 1, 4, 5, 6, 3, 2};
        Scanner scan = new Scanner(System.in);
        int [] array = new int[scan.nextInt()];
        for(int i=0;i< array.length; i++){
            array[i] = scan.nextInt();
        }
        System.out.print(countDuplicates(array));
    }
    public static int countDuplicates(int [] numbers){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int size = numbers.length;
        int count =0;
        for(int i=0; i< size; i++){
            if(hashMap.containsKey(numbers[i])){
                int value = hashMap.get(numbers[i]);
                if(value == 1){
                    count ++;
                }
                hashMap.put(numbers[i], value+1);
            }else{
                hashMap.put(numbers[i], 1);
            }
        }
        return count;
    }
}

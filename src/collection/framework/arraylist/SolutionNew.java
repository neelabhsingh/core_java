package collection.framework.arraylist;

/**
 * Created by neelabhsingh on 25/10/16.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SolutionNew {

    public static void main(String [] args){

        int a[] = {3, 7,5};
        System.out.println(countUneatenLeaves(10,a));
    }
    static int countUneatenLeaves(int numberOfLeaves, int[] caterpillars) {
        if(numberOfLeaves<= 0)
            return 0;
        if(caterpillars == null || caterpillars.length == 0)
            return 0;

        int length = caterpillars.length;
        Set<Integer > eatenLeaf = new HashSet<Integer>();
        Arrays.sort(caterpillars);
        for(int i = 0 ; i < length; i++){
            if(caterpillars[i] == 1)
                return 0;
            else if(eatenLeaf.contains(caterpillars[i]))
                continue;
            else
                leavesEatten(eatenLeaf, caterpillars[i],numberOfLeaves);

        }
        return (numberOfLeaves - eatenLeaf.size());
    }
    static void  leavesEatten(Set<Integer> eaten , int cater , int numberOfLeaves){
        if(cater <= 0)
            return;

        int nextLeave = cater;
        while(nextLeave <=  numberOfLeaves){
            if(!eaten.contains(nextLeave))
                eaten.add(nextLeave);
            nextLeave += cater;
        }
    }

}


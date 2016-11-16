package Comparator;
import java.util.Comparator;
import java.util.*;
/**
 * Created by neelabhsingh on 04/11/16.
 */
public class ComparatorDemo {
    public static void main(String [] args){
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");
        HDTV tv3 = new HDTV(42, "Panasonic");
        ArrayList<HDTV> hdtvArrayList=new ArrayList<HDTV>();
        hdtvArrayList.add(tv1);
        hdtvArrayList.add(tv2);
        hdtvArrayList.add(tv3);
        Collections.sort(hdtvArrayList, new SizeComparator());
        Iterator itr = hdtvArrayList.iterator();
        while (itr.hasNext()){
            System.out.println(((HDTV)itr.next()).getBond());
        }
    }
}
class HDTV{
    private int size;
    private String bond;
    HDTV(int size, String bond){
        this.size = size;
        this.bond = bond;
    }
    public int getSize(){
        return size;
    }
    public String getBond(){
        return bond;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setBond(String bobd){
        this.bond =bond;
    }
}

class SizeComparator implements Comparator<HDTV>{
    @Override
    public int compare(HDTV hdtv_obj1, HDTV hdtv_obj2) {
        int tv1_size = hdtv_obj1.getSize();
        int tv2_size = hdtv_obj2.getSize();
        if(tv1_size > tv2_size){
            return 1;
        }else if(tv1_size < tv2_size){
            return -1;
        }else{
            return 0;
        }
    }
}
package ImmutableClass;

/**
 * Created by neelabhsingh on 31/10/16.
 */
import java.util.Date;
final class ImmutableClass{
    private final Integer immutableField1;
    private final String immutableField2;
    private final Date mutableField3;
    private ImmutableClass(Integer field1, String field2, Date date){
        this.immutableField1 = field1;
        this.immutableField2 = field2;
        this.mutableField3 = date; //Wrong
        //this.mutableField3 = new Date(date.getTime());
    }
    public static ImmutableClass createNewInstance(Integer field1, String field2, Date date){
        return new ImmutableClass(field1, field2, date);
    }
    public Integer getImmutableField1(){
        return this.immutableField1;
    }
    public String getImmutableField2(){
        return this.immutableField2;
    }
    public Date getMutableField3(){
        return new Date(this.mutableField3.getTime());
    }

    @Override
    public String toString() {
        return this.immutableField1+ "-"+this.immutableField2 +"-"+this.mutableField3;
    }
}
public class ImmutableClassDemo {
    public static void main(String [] args){
        ImmutableClass im = ImmutableClass.createNewInstance(100, "Test", new Date());
        System.out.println(im);
        tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField3());
        System.out.println(im);
    }
    public static void tryModification(Integer field1, String field2, Date date){
        field1 = 20000;
        field2 = "Test343";
        //date.
    }
}

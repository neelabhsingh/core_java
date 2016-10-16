package collection.framework.enumeration;

/**
 * Created by neelabhsingh on 13/10/16.
 */
import java.util.Vector;
import java.util.Enumeration;
public class EnumerationDemo {
    public static void main(String [] args){
        Enumeration days;
        Vector daysName = new Vector();
        daysName.add("Sunday");
        daysName.add("Monday");
        daysName.add("Tuesday");
        daysName.add("Wednesday");
        daysName.add("Thursday");
        daysName.add("Friday");
        daysName.add("Saturday");
        days = daysName.elements();
        while (days.hasMoreElements()){
            System.out.print(days.nextElement()+ " ");
        }
    }
}

package classloding;

/**
 * Created by neelabhsingh on 20/10/16.
 */
public class ClassInitalizationTest1 {
    public static void main(String [] args){
        System.out.println(Child1.familtyName);
    }
}
class Parenttest{
    protected static String familtyName ="Lawson";
    static {
        System.out.print("Static block of super class is initialized");
    }
    {System.out.print("Non static blocks in super class is initialized");}
}
class Child1 extends Parenttest{

}
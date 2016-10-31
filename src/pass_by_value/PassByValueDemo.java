package pass_by_value;

/**
 * Created by neelabhsingh on 31/10/16.
 */
class Foo{
    private String attribute;
    Foo(String a){
        this.attribute = a;
    }
    public String getAttribute(){
        return this.attribute;
    }
    public void setAttribute(String a){
        this.attribute = a;
    }
}
public class PassByValueDemo {
    public static void main(String [] args){
        Foo f = new Foo("f");
        changeReference(f);
        System.out.println("After calling changeReference "+ f.getAttribute()); // Java is call by value not reference
        setAttribute(f);
        System.out.println("After calling setAttribute "+ f.getAttribute());// But able to change the attribute of object
    }
    public static void changeReference(Foo a){
        Foo c = new Foo("c");
        a = c;
    }
    public static void setAttribute(Foo a){
        a.setAttribute("d");
    }
}

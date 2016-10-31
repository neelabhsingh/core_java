package AccessModifier;

/**
 * Created by neelabhsingh on 31/10/16.
 */
class A{
    String name;
    int rollNumber;
    class B{
        public void show(){
            System.out.print("Class B");
        }
    }

    public void show(){
        System.out.print("Class A");
    }
}
public class InnerClassAsInstance {
    public static void main(String [] args){
        A a = new A();
        A.B b = a.new B();
        b.show();
    }
}

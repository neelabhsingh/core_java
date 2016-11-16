package AccessModifier;

/**
 * Created by neelabhsingh on 31/10/16.
 */
public class StaticInnerClass {
    public static void main(String [] args){
        AStatic a = new AStatic();
        AStatic.B b = new AStatic.B();
        b.show();
    }
}
class AStatic{
    String name;
    int rollNumber;
    static class B{
        public void show(){
            System.out.print("Class B");
        }
    }

    public void show(){
        System.out.print("Class A");
    }
}


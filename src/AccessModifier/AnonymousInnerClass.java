package AccessModifier;

/**
 * Created by neelabhsingh on 31/10/16.
 */
public class AnonymousInnerClass {

    public static void main(String [] args){
        BAnony b = new BAnony(){
            public void show(){
                System.out.print("AnonymousInnerClass");
            }
        };
        b.show();
    }
}

class BAnony{
    public void show(){
        System.out.print("class B");
    }
}

package InstanceOfTest;

/**
 * Created by neelabhsingh on 24/10/16.
 */
interface Printable{}
class A implements Printable{
    public void a(){
        System.out.print(" Method");
    }
}
class B implements Printable{
    public void b(){
        System.out.println("B Method");
    }
}
class Call{
    void invoke(Printable p){
        if(p instanceof A){
            A a = (A)p;
            a.a();
        }
        if(p instanceof B){
            B b = (B)p;
            b.b();
        }
    }
}
public class RealUserOfInstance {
    public static void main(String [] args){
        Printable print = new B();
        Call c = new Call();
        c.invoke(print);
    }
}

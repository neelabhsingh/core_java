package oops.polymorphism;

/**
 * Created by neelabhsingh on 09/10/16.
 */

class ClassA{
    public void method(Number n){
        System.out.println("Class A: "+ n + " "+ n.getClass());
    }
    public void method1(Number n1){
        System.out.println("Class A: "+ n1+" "+n1.getClass());
    }
}
class ClassB extends ClassA{
    public void method(Integer d){
        System.out.println("Class B: "+ d + " "+ d.getClass());
    }
    @Override
    public void method1(Number n1){
        System.out.println("Class B: "+ n1+" "+n1.getClass());
    }
}
public class InheritedOverloading {
    public static void main(String [] args){
        ClassA a = new ClassB();
        a.method(3);
        a.method1(3);
    }
}

package oops.polymorphism.override;

/**
 * Created by neelabhsingh on 09/10/16.
 */

class Animal{
    public static void testClassMethod(){
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod(){
        System.out.println("The instance method in Animal");
    }
}
class Cat extends Animal{
    public static void testClassMethod(){
        System.out.println("The static method in Cat");
    }
    @Override
    public void testInstanceMethod(){
        System.out.println("The instance method in Cat");
    }
}
public class StaticOverrideDemo {
    public static void main(String [] args){
        Cat mycat = new Cat();
        Animal animal = mycat;
        Animal.testClassMethod();
        animal.testInstanceMethod();
    }
}

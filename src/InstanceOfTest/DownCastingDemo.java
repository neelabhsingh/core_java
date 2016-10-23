package InstanceOfTest;

/**
 * Created by neelabhsingh on 24/10/16.
 */
class Animal{
    public void speak(){
        System.out.println("Animal Speak");
    }
}
class Dog extends Animal{
    public void speak(){
        System.out.println("Dog Barks");
    }
    public void eat(){
        System.out.println("Dog Eats");
    }
}
public class DownCastingDemo {
    public static void main(String [] args){
        Animal a =new Dog();
        downCastByUsingInstanceof(a);
        Animal ani1 = new Animal();
        downCastwithoutInstanceof(ani1);
    }
    public static void downCastByUsingInstanceof(Animal a){
        if(a instanceof Dog){
            Dog dog1 = (Dog)a;
            System.out.print("Downcasting is performed");
        }
    }
    // Following method will compilation error "java.lang.ClassCastException"
    public static void downCastwithoutInstanceof(Animal a){
        Dog dog1 = (Dog)a;
        System.out.print("Downcasting is performed");
    }
}

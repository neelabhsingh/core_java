package InstanceOfTest;

/**
 * Created by neelabhsingh on 24/10/16.
 */
class Parent{
    public Parent(){

    }
}
class Child extends Parent{
    public Child(){
        super();
    }
}
public class InstanceofDemo {
    public static void main(String [] args){
        Child child = new Child();
        Parent parent1 = new Child();
        Parent parent2 = new Parent();
        System.out.println(child instanceof Parent);
        System.out.println(parent1 instanceof Child);
        System.out.println(parent2 instanceof Child);
    }
}

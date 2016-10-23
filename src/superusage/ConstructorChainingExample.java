package superusage;

/**
 * Created by neelabhsingh on 20/10/16.
 */
public class ConstructorChainingExample {
    public static void main(String [] args){
        Child emptyChild = new Child();
    }
}
class Parent{
    private String name;
    protected Parent(){
        this("");
        System.out.println("No argument constructor of Parent called");
    }
    protected Parent(String name) {
        this.name = name;
        System.out.println("One String argument constructor of Parent called");
    }
}

class Child extends Parent{
    private String name;
    protected Child(){
        this("");
    }
    protected Child(String name){
        super(name);
        System.out.print("One argument constructor of Super class called from sub class");
    }
}
package classloding;

/**
 * Created by neelabhsingh on 20/10/16.
 */
public class ClassInitializationTest {
    public static void main(String [] args){
        NotUsed o = null;////this class is not used, should not be initialized
        Child child = new Child();
    }
}

class NotUsed{
    static {
        System.out.println("NotUsed class is initialized");
    }
}

class Parent{
    static {
        System.out.println("static block of Super class is initialized");
    }
    { System.out.println("non static block of Super class is initialized");}
}

class Child extends Parent{
    static {
        System.out.println("static block of sub-class class is initialized");
    }
    { System.out.println("non static block of sub-class is initialized");}
}
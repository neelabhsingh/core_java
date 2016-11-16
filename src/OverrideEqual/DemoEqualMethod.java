package OverrideEqual;

/**
 * Created by neelabhsingh on 16/11/16.
 */
class Employee{
    String name;
    int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
}
class Person{
    String name;
    int id;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        Employee per = (Employee) obj;
        /*
        Person per = (Person) obj;
        if(per.getClass() != this.getClass()){
            return false;
        }*/
        return per.id == this.id && per.name.equals(per.name);
    }
}
public class DemoEqualMethod {
    public static void main(String [] args){
        Employee employee = new Employee("Neelabh", 123);
        Person person = new Person("Neelabh", 123);
        System.out.print(person.equals(employee));
    }
}

package collection.framework.sortedmap;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Set;
/**
 * Created by neelabhsingh on 08/10/16.
 */
public class TreeMapWithComparator {
    public static void main(String [] args){
        TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new NameComparator());
        treeMap.put(new Employee("Ram",3000), "RAM");
        treeMap.put(new Employee("John",6000), "JOHN");
        treeMap.put(new Employee("Crish",2000), "CRISH");
        treeMap.put(new Employee("Tom",2400), "TOM");
        Set<Employee> keys = treeMap.keySet();
        System.out.println("TreeMap: Sorting with name "+ treeMap);
        for(Employee key : keys) {
            System.out.println("Key: "+ key + " Value: "+ treeMap.get(key));
        }

        TreeMap<Employee, String> treeMap1 = new TreeMap<Employee, String>(new SalaryComparator());
        treeMap1.put(new Employee("Ram",3000), "RAM");
        treeMap1.put(new Employee("John",6000), "JOHN");
        treeMap1.put(new Employee("Crish",2000), "CRISH");
        treeMap1.put(new Employee("Tom",2400), "TOM");
        Set<Employee> keys1 = treeMap1.keySet();
        System.out.println("TreeMap: Sorting with Salary "+ treeMap1);
        for(Employee key1: keys1){
            System.out.println("Key: "+ key1 + " Value: "+ treeMap1.get(key1));
        }

    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (new Integer(emp1.getSalary())).compareTo(new Integer(emp2.getSalary()));
    }
}
class Employee{
    private String name;
    private int salary;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return  this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Name : "+ this.name +" Salary: "+ this.salary;
    }
}
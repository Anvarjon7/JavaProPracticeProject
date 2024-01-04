package de.telran.javaProPractice;

public class Employee extends Person {
    public Employee(String name, String company) {
        super(name, 20);
        this.company = company;
    }
    String company;

    @Override
    public void display() {
        super.display();
        System.out.println("Company: " + company);
    }

    //    public void work(){
//        System.out.print( getName() + " works in " + company);
//    }


    public static void main(String[] args) {

        Person tom = new Person("Tom", 20);
        Employee sam = new Employee("Sam","Apple");

        sam.display();
//        sam.work();
    }
}

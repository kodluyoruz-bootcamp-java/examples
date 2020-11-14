package org.kodluyoruz.examples.inheritanceexamples.multipleinheritance;

public class Main {

    public static void main(String[] args) {
        Human employee = new Employee();
        employee.printClassType();
        Human manager = new Manager();
        manager.printClassType();

    }
}

package org.kodluyoruz.examples.inheritanceexamples.multipleinheritance;

public abstract class Human {
    void printClassType() {
        System.out.println("Class Name = " + this.getClass().getSimpleName());
    }
}

class Employee extends Human {
    @Override
    void printClassType() {
        System.out.println("Class Name = " + this.getClass().getSimpleName());
    }
}

class Manager extends Employee {
    @Override
    void printClassType() {
        super.printClassType();
        System.out.println("Class Name = " + this.getClass().getSimpleName());
    }
}
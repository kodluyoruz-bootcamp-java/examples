package org.kodluyoruz.examples.encapsulation;

public class EncapsulationExample {

    // getter / setter methodlar camelCase olmalı.
    // getter prefixes = get{MethodName}
    private String name;
    private int age;

    public EncapsulationExample() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EncapsulationExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

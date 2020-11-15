package org.kodluyoruz.examples.encapsulation;

public class Main {

    public static void main(String[] args) {
        EncapsulationExample instance = new EncapsulationExample();
        System.out.println(instance.toString());
        instance.setName("Mehmet");
        instance.setAge(118);
        System.out.println(instance.toString());


    }
}

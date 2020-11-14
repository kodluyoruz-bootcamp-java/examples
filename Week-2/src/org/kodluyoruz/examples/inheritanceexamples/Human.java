package org.kodluyoruz.examples.inheritanceexamples;

public class Human {

    private boolean hasBrain = true;
    private int age;
    private boolean isAlive = true;



    public Human(int age) {
        this.age = age;
    }

    public void changeToIdiot() {

        if (isAlive) {
            hasBrain = false;
            System.out.println("İnsanı beyinsiz yaptın..");
        }
    }

    public void dead() {
        if (isAlive) {
            isAlive = false;
            System.out.println("Afferin, insanı öldürdün..");
        } else {
            System.out.println("Insan zaten ölmüş, onu nasıl öldürsin..");
        }
    }

    public void printHumanProperties() {
        System.out.printf("Human has brain = %s, Human age = %s, Is alive =  %s",
                hasBrain, age, isAlive);
        System.out.println();
    }


}

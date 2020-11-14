package org.kodluyoruz.examples.inheritanceexamples;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.printHumanProperties();
        student.changeToIdiot();
        student.dead();
        student.printHumanProperties();
        student.writeSchoolNumber();

        Student student1 = new Student(25);
        student1.printHumanProperties();
        student1.changeToIdiot();
        student1.dead();
        student1.printHumanProperties();
        student1.writeSchoolNumber();

        System.out.println("is student a Human = " + (student instanceof Human));


        Student student2 = new Student(25, 12345);
        student2.writeSchoolNumber();

        Human student3 = new Student(24, 12345);
        ((Student) student3).writeSchoolNumber();

        Student student4 = new Student(18);
        ((Human) student4).printHumanProperties();
    }
}

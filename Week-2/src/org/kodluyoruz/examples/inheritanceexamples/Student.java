package org.kodluyoruz.examples.inheritanceexamples;

public class Student extends Human {

    private int schoolNumber;

    public Student(int age, int schoolNumber) {
        super(age);
        this.schoolNumber = schoolNumber;
    }

    public Student() {

        super(18);
        System.out.println("Parametresi constructor cagirildi");

    }

    public Student(int age) {
        super(age);
        System.out.println("Parametreli constructor cagirildi");
    }

    public void writeSchoolNumber() {
        System.out.println(schoolNumber);
    }


}

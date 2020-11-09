package org.kodluyoruz.example.constructorexample;

/**
 * Username = baranbuyuk
 * Date = 7.11.2020 15:17
 **/
public class Student {
    private String name;
    private int number;
    private Integer average;

    public Student() {
    }


    public Student(String name, int number, Integer average) {
        this.name = name;
        this.number = number;
        this.average = average;
    }

}

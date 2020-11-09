package org.kodluyoruz.example.conditions;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 11:33
 **/
public class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean isGreaterThan50(){
        if(this.age > 50) {
            return true;
        }
        return false;
    }
}

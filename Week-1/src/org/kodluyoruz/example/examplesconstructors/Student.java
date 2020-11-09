package org.kodluyoruz.example.examplesconstructors;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 10:11
 **/
public class Student {

    public int note;
    public String name;
    public String gender;

    public Student() {
        this.note = 100;
        this.name = "Default Name";
        this.gender = "Default Gender";
        writeStudentInfo(note,name,gender);
    }

    public Student(String name) {
        this.name = name;
        this.gender = "Default Gender";
        this.note = 100;
        writeStudentInfo(note,name,gender);


    }

    public Student(int note, String name, String gender) {
        writeStudentInfo(note,name,gender);
    }

    public void writeStudentInfo(int note, String name, String gender) {
        System.out.println("Note :" + note + " Name :" + name + " Gender :" + gender);
    }
}

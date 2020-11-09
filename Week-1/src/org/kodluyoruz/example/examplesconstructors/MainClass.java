package org.kodluyoruz.example.examplesconstructors;

import org.kodluyoruz.example.variables.VariablesExample;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 10:13
 **/
public class MainClass {


    public static void main(String[] args) {
        Student ogrenci = new Student();
        Student ogrenci2 = new Student("Cagatay");
        Student ogrenci3 = new Student( 100,"Mehmet","Erkek");
        VariablesExample variables = new VariablesExample();

    }
}

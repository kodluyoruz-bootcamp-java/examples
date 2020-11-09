package org.kodluyoruz.example.variables;

/**
 * Username = baranbuyuk
 * Date = 8.11.2020 10:59
 **/
public class VariablesScope {

    int globalScope = 10;

    public void printAllVariable() {
        int methodScope = 10;
        System.out.println(globalScope);
        System.out.println(methodScope);
    }

    public void tryToPrintMethodVariables(){
        System.out.println(globalScope);
    }
}

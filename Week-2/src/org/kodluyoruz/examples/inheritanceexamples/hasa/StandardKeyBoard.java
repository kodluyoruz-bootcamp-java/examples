package org.kodluyoruz.examples.inheritanceexamples.hasa;

public class StandardKeyBoard implements KeyBoard {

    @Override
    public void read() {
        System.out.println("Read from standard keyboard");
    }
}

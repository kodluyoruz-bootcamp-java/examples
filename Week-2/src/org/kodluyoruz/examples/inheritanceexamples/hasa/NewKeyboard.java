package org.kodluyoruz.examples.inheritanceexamples.hasa;

public class NewKeyboard implements KeyBoard {
    @Override
    public void read() {
        System.out.println("Read from new keyboard");
    }
}

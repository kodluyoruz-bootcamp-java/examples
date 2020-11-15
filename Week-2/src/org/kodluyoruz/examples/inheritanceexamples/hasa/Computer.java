package org.kodluyoruz.examples.inheritanceexamples.hasa;

public class Computer {

    private Screen screen;
    private KeyBoard keyBoard;

    public Computer(Screen screen, KeyBoard keyBoard) {
        this.screen = screen;
        this.keyBoard = keyBoard;
    }

    // readFromGamingKeybord()
    // readFromStandarKeyboard()
    // showAppleScreen()
    // showStandarScreen()

    public void show() {
        this.screen.showScreen();
    }

    public void read() {
        this.keyBoard.read();
    }


}

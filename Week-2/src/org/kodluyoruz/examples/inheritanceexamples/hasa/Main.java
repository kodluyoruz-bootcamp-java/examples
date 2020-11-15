package org.kodluyoruz.examples.inheritanceexamples.hasa;

public class Main {

    public static void main(String[] args) {

        // Computer nesnesi olusturmak icin iki tane nesneye ihtiyac var.
        // 1 - Screen
        // 2 - Keyboard

        Screen screen = new StandardScreen();
        KeyBoard keyBoard = new StandardKeyBoard();

        Computer computer = new Computer(screen, keyBoard);
        computer.read();
        computer.show();


        Screen appleScreen = new AppleScreen();
        KeyBoard gamingKeyBoard = new GamingKeyBoard();

        KeyBoard newKeyboard  = new NewKeyboard();

        Computer computer2 = new Computer(appleScreen, newKeyboard);
        computer2.read();
        computer2.show();


    }
}

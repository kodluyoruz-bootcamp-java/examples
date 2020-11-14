package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public class Human extends Specie implements Runnable, Moveable{

    private String name;

    public Human(boolean isBreath, String name) {
        super(isBreath);
        this.name = name;
    }

    @Override
    public void move() {

    }

    @Override
    public void run() {

    }
}

package org.kodluyoruz.examples.inheritanceexamples.interfaces;

public class Fish extends Specie implements Moveable {

    private boolean isMoving = false;

    public Fish(boolean isBreath, boolean isMoving) {
        super(isBreath);
        this.isMoving = isMoving;
    }

    @Override
    public void move() {
        if (isMoving) {
            System.out.println("Moving");
        } else {
            System.out.println("Fish not move");
        }
    }

    public void startToMove() {
        if (isMoving) {
            System.out.println("Fish already is moving");
        } else {
            isMoving = true;
            System.out.println("Fish start to move");
        }

    }

    public void stopMove() {
    }
}

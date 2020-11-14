package org.kodluyoruz.examples.classes;

import org.kodluyoruz.examples.inheritanceexamples.Human;

public class Main {

    public static void main(String[] args) {
        Human human = new Human(37);
        human.printHumanProperties();
        human.changeToIdiot();
        human.printHumanProperties();
        human.dead();
        human.dead();

    }
}

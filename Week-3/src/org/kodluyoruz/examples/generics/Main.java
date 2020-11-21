package org.kodluyoruz.examples.generics;


import org.kodluyoruz.examples.generics.generic.impl.NumberStack;
import org.kodluyoruz.examples.generics.generic.impl.StringStack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>(3);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        StringStack<String> stringStack = new StringStack(10);
        NumberStack<Long> numberStack = new NumberStack<>(10);

        integerStack.pop();
        integerStack.pop();

        integerStack.print();

        String[] names = {"Ahmet", "Mehmet", "Ali",
                "Ayşe", "Ayşe", "Furkan", "Furkan"};

        Integer[] numbers = {1, 2, 3, 4, 4, 4, 5, 6, 6};

        int count = GenericMethodExamples.countAllRepeatedItems(names, "Ayşe");
        System.out.println("Same names: " + count);
        int numberCount = GenericMethodExamples.countAllRepeatedItems(numbers, 4);
        System.out.println("Same numbers : " + numberCount);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ahmet");
        nameList.add("Mehmet");
        nameList.add("Mehmet");

        int numberOfNames = GenericMethodExamples.countAllRepeatedItems(nameList, 1.00);
        System.out.println("NSame names: " + numberOfNames);

        ArrayList<Object> stList = new ArrayList<>();
        stList.add(1L);
        stList.add(2L);
        stList.add(3L);
        GenericMethodExamples.countAllRepeatedItemsWithRestricted(stList, "test");

    }
}

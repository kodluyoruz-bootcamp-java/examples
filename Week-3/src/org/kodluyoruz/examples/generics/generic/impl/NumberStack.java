package org.kodluyoruz.examples.generics.generic.impl;


import org.kodluyoruz.examples.generics.Stack;

public class NumberStack<T extends Number> extends Stack<T> {
    public NumberStack(int size) {
        super(size);
    }
}

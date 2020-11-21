package org.kodluyoruz.examples.generics.generic.impl;

import org.kodluyoruz.examples.generics.Stack;

public class StringStack<T extends String> extends Stack<T> {

    public StringStack(int size) {
        super(size);
    }
}

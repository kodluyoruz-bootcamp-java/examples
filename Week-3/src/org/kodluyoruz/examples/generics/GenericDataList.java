package org.kodluyoruz.examples.generics;

public interface GenericDataList<T> {

    void push(T item);

    T pop();

    void print();
}

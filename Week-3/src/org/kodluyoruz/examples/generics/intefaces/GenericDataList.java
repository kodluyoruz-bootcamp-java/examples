package org.kodluyoruz.examples.generics.intefaces;

public interface GenericDataList<T> {

    void push(T item);

    T pop();

    void print();
}

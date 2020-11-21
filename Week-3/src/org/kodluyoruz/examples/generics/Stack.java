package org.kodluyoruz.examples.generics;


import org.kodluyoruz.examples.generics.intefaces.GenericDataList;

/**
 * T -> Type
 * E -> Element
 * V - Value
 * R - Result
 *
 * @param <TYPE>
 */
public class Stack<T> implements GenericDataList<T> {

    private int topIndex;
    private int size;
    private T[] items;

    public Stack(int size) {
        this.size = size;
        this.topIndex = -1;

        this.items = (T[]) new Object[this.size];
    }

    @Override
    public void push(T item) {
        this.topIndex++;// ilk eleman icin burası 0 oldu
        if (this.topIndex >= this.items.length) {
            System.out.println("Yığın Kapasite hatası, üst limit hatası");
            return;
        }
        this.items[this.topIndex] = item;
    }

    @Override
    public T pop() {
        if (topIndex < 0) {
            System.out.println("Yıgında herhangi bir item yok");
        }
        T item = this.items[this.topIndex];
        this.items[this.topIndex] = null;
        this.topIndex--;
        return item;
    }


    @Override
    public void print() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public T[] getItems() {
        return this.items;
    }
}

package org.kodluyoruz.examples.generics;

public class Queue<T> implements GenericDataList<T> {

    private int size;
    private int frontIndex;
    private int dataInsertionIndex;
    private T[] values;



    @Override
    public void push(T item) {
        if (this.isEmpty()) {
            this.frontIndex = 0;
            this.dataInsertionIndex = -1;
        }
        if (this.isFull()) {
            throw new RuntimeException("Kuyruk dolu eleman ekleyemezsiniz");
        } else if (this.frontIndex != 0 && this.dataInsertionIndex ==
                this.size - 1) {
            this.dataInsertionIndex = -1;
        }
        this.dataInsertionIndex++;
        this.values[this.dataInsertionIndex] = item;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            this.frontIndex = 0;
            this.dataInsertionIndex = -1;
            throw new RuntimeException("Kuyruk boş eleman çekemezsiniz!");
        }
        T value = this.values[this.frontIndex];
        this.values[this.frontIndex] = null;
        this.frontIndex++;
        if (this.frontIndex == this.size && this.dataInsertionIndex
                != this.size - 1) {
            this.frontIndex = 0;
        }
        return value;
    }

    @Override
    public void print() {
        for (T value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private boolean isFull() {
        return this.frontIndex == 0 && this.dataInsertionIndex ==
                this.size - 1 ||
                (this.frontIndex != 0 &&
                        this.values[this.frontIndex] != null &&
                        this.values[this.dataInsertionIndex] !=
                                null &&
                        this.dataInsertionIndex != this.size - 1 && Math.abs(this.frontIndex -
                        this.dataInsertionIndex) == 1);
    }


    private boolean isEmpty() {
        return this.frontIndex == 0 && this.dataInsertionIndex == -
                1 || (this.frontIndex != 0 &&
                this.dataInsertionIndex != this.size - 1 &&
                this.values[this.frontIndex] == null &&
                this.values[this.dataInsertionIndex] == null &&
                Math.abs(this.frontIndex -
                        this.dataInsertionIndex) == 1);
    }
}

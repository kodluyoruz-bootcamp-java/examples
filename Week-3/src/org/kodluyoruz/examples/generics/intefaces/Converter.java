package org.kodluyoruz.examples.generics.intefaces;

public interface Converter<INPUT,OUTPUT> {

    OUTPUT convert(INPUT input);
}

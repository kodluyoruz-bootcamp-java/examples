package org.kodluyoruz.examples.generics;

public interface Converter<INPUT,OUTPUT> {

    OUTPUT convert(INPUT input);
}

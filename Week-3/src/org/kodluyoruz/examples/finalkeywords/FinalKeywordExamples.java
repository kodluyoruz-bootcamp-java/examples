package org.kodluyoruz.examples.finalkeywords;

public class FinalKeywordExamples {

    /**
     * Final keywordü değişkenler, methodlar ve sınıflarda kullanılabilir.
     */

    public static final Double PI = 3.14;

    public static void main(String[] args) {

    }
}

class PINumber {

    private final Double value;


    public PINumber(Double value) {
        this.value = value;
    }

    public final Double getPINumber() {
        return value;
    }
}

class ExtendedPINumber extends PINumber {

    public ExtendedPINumber(Double value) {
        super(value);
    }
}


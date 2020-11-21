package org.kodluyoruz.examples.generics;

import java.util.List;

public class GenericMethodExamples {

    private GenericMethodExamples() {
    }

    public static <T> int countAllRepeatedItems(T[] array, T item) {

        int count = 0;

        if (item == null) {
            for (T listItem : array)
                if (listItem == null)
                    count++;
        } else {
            for (T listItem : array)
                if (item.equals(listItem))
                    count++;
        }
        return count;
    }

    public static <T> int countAllRepeatedItems(List<?> array, T item) {
        int count = 0;

        if (item instanceof Integer) {
            System.out.println("Bu bir numaradır");
        } else if (item instanceof String) {
            System.out.println("Bu bir karakter dizisidir.");
        } else {
            System.out.println("Ben bilmiyom ağam objedir bu..");
        }
        if (item == null) {
            for (Object listItem : array)
                if (listItem == null)
                    count++;
        } else {
            for (Object listItem : array)
                if (item.equals(listItem))
                    count++;
        }
        return count;
    }


}

package org.kodluyoruz.examples.dateexamples;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date dateEmptyConst = new Date();
        System.out.printf("Now: %s \n", dateEmptyConst.toString());

        Date date = new Date(System.currentTimeMillis() - 200000);
        System.out.printf("Now: %s \n", date.toString());

        SimpleDateFormat simpleFormat = new SimpleDateFormat("MM.YYYY.dd");
        System.out.println(simpleFormat.format(new Date()));


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

    }
}

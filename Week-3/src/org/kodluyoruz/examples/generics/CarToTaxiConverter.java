package org.kodluyoruz.examples.generics;

import org.kodluyoruz.examples.generics.intefaces.Converter;

public class CarToTaxiConverter implements Converter<Car, Taxi> {

    @Override
    public Taxi convert(Car car) {
        Taxi taxi = new Taxi(car.getModel(), car.getYear());
        return taxi;
    }
}

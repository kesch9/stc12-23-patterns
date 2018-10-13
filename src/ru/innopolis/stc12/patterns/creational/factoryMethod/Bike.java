package ru.innopolis.stc12.patterns.creational.factoryMethod;

public class Bike implements Transport {

    private static final Integer PASSENGER = 2;

    @Override
    public void move(Integer km) {
        System.out.println("Bike is riding for " + km + " kilometres");
    }

    @Override
    public Integer getPassenger() {
        return PASSENGER;
    }
}

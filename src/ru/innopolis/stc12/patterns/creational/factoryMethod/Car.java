package ru.innopolis.stc12.patterns.creational.factoryMethod;

public class Car implements Transport {

    private static final Integer PASSENGER = 5;

    @Override
    public void move(Integer km) {
        System.out.println("Car is riding for " + km + " kilometres");
    }

    @Override
    public Integer getPassenger() {
        return PASSENGER;
    }
}

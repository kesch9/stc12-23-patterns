package ru.innopolis.stc12.patterns.creational.abstractFactory.car;

public class RaceCar implements Car {
    @Override
    public void wash() {
        System.out.println("Мыть гоночную машину");
    }

    @Override
    public void setup() {
        System.out.println("Настраивать гоночную машину");
    }
}

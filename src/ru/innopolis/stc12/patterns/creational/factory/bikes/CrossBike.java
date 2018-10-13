package ru.innopolis.stc12.patterns.creational.factory.bikes;

import ru.innopolis.stc12.patterns.creational.factory.Bikes;

public class CrossBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Cross Engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Cross Bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Cross Bike switched off");
    }
}

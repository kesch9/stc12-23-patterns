package ru.innopolis.stc12.patterns.creational.factory.bikes;

import ru.innopolis.stc12.patterns.creational.factory.Bikes;

public class SportBike implements Bikes {
    @Override
    public void start() {
        System.out.println("Sport Engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Sport Bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Sport Bike switched off");
    }
}

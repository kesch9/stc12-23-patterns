package ru.innopolis.stc12.patterns.creational.factory.bikes;

import ru.innopolis.stc12.patterns.creational.factory.Bikes;

public class ChopperBike  implements Bikes {
    @Override
    public void start() {
        System.out.println("Chopper Engine started");
    }

    @Override
    public void run(Integer km) {
        System.out.println("Chopper Bike running " + km + " kilometres");
    }

    @Override
    public void switchOff() {
        System.out.println("Chopper Bike switched off");
    }
}

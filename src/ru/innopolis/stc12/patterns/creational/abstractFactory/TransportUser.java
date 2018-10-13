package ru.innopolis.stc12.patterns.creational.abstractFactory;

import ru.innopolis.stc12.patterns.creational.abstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.factory.Factory;

public class TransportUser {
    private Car car;
    private Bike bike;

    public TransportUser(Factory factory) {
        car = factory.createCar();
        bike = factory.createBike();
    }

    public void useTransport(){
        car.setup();
        car.wash();
        bike.race();
        bike.repair();
    }
}

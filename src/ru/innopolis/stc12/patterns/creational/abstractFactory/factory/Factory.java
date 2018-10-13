package ru.innopolis.stc12.patterns.creational.abstractFactory.factory;

import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.car.Car;

public abstract class Factory {
    public abstract Car createCar();
    public abstract Bike createBike();
}

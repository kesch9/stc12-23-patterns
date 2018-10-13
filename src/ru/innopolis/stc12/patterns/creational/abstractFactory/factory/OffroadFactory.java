package ru.innopolis.stc12.patterns.creational.abstractFactory.factory;

import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.CrossBike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.abstractFactory.car.OffroadCar;

public class OffroadFactory extends Factory {
    @Override
    public Car createCar() {
        return new OffroadCar();
    }

    @Override
    public Bike createBike() {
        return new CrossBike();
    }
}

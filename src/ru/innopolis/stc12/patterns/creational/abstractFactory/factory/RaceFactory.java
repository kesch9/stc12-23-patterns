package ru.innopolis.stc12.patterns.creational.abstractFactory.factory;

import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.Bike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.bike.SportBike;
import ru.innopolis.stc12.patterns.creational.abstractFactory.car.Car;
import ru.innopolis.stc12.patterns.creational.abstractFactory.car.RaceCar;

public class RaceFactory extends Factory {
    @Override
    public Car createCar() {
        return new RaceCar();
    }

    @Override
    public Bike createBike() {
        return new SportBike();
    }
}

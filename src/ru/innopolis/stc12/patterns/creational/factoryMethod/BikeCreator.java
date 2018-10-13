package ru.innopolis.stc12.patterns.creational.factoryMethod;

public class BikeCreator extends TransportUser {
    @Override
    public Transport factoryMethod() {
        return new Bike();
    }
}

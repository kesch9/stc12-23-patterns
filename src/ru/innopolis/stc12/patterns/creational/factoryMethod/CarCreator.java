package ru.innopolis.stc12.patterns.creational.factoryMethod;

public class CarCreator extends TransportUser {
    @Override
    public Transport factoryMethod() {
        return new Car();
    }
}

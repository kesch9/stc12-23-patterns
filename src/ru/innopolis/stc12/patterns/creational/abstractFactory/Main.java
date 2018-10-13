package ru.innopolis.stc12.patterns.creational.abstractFactory;

import ru.innopolis.stc12.patterns.creational.abstractFactory.factory.OffroadFactory;
import ru.innopolis.stc12.patterns.creational.abstractFactory.factory.RaceFactory;

public class Main {
    public static void main(String[] args) {
        TransportUser transportUser = new TransportUser(new OffroadFactory());
        transportUser.useTransport();
        System.out.println("______________________");
        transportUser = new TransportUser(new RaceFactory());
        transportUser.useTransport();
    }

}

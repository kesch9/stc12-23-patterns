package ru.innopolis.stc12.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Bikes bike = factory.makeBike("chopper");
        bike.run(14);
    }
}

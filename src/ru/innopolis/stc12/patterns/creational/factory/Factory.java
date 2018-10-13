package ru.innopolis.stc12.patterns.creational.factory;

import ru.innopolis.stc12.patterns.creational.factory.bikes.ChopperBike;
import ru.innopolis.stc12.patterns.creational.factory.bikes.CrossBike;

public class Factory {
    public Bikes makeBike(String type){
        switch (type){
            case "sport":
                return new ChopperBike();
            case "cross":
                return new CrossBike();
            case "chopper":
                return new ChopperBike();
        }
        return null;
    }
}

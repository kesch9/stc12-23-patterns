package ru.innopolis.stc12.patterns.behavioral.state;

public class OffState extends State {

    public OffState(Bike bike) {
        super(bike);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRide() {
        System.out.println("FAIL - engine is off");
    }

    @Override
    public void onArrive() {

    }

    @Override
    public void onOff() {

    }

}

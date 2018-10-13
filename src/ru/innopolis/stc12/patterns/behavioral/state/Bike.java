package ru.innopolis.stc12.patterns.behavioral.state;

public class Bike {

    private boolean engineRunning;
    private boolean riding;
    private State state;

    public void changeState(State state){
        this.state = state;
    };


}

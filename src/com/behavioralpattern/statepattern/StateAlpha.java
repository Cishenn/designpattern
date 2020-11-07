package com.behavioralpattern.statepattern;

public class StateAlpha extends State {
    @Override
    void Handle(Context context) {
        System.out.println("State Alpha Toggle");
        context.setState(new StateBeta());
    }
}

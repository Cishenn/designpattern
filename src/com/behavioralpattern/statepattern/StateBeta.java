package com.designpatterndemo.statepattern;

public class StateBeta extends State {
    @Override
    void Handle(Context context) {
        System.out.println("State Beta Toggles");
        context.setState(new StateAlpha());
    }
}

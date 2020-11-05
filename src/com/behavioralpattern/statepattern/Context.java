package com.designpatterndemo.statepattern;

public class Context {
    State state;

    Context(){
        this.state=new StateAlpha();
    }

    public void setState(State state){
        this.state=state;
    }

    public State getState(){
        return state;
    }

    public void Handle(){
        state.Handle(this);
    }
}

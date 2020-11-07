package com.structuralpattern.facadepattern;

public class Facade {
    Intricate intricate=new Intricate();
    Involute involute=new Involute();
    Tanglesome tanglesome=new Tanglesome();

    public void receptionist(){
        intricate.method();
        involute.method();
        tanglesome.method();
    }
}

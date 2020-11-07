package com.creationalpattern.singleonpattern;

public class SingleonPatternDemo {
    public static void main(String[] args){
        Singleon singleon=Singleon.getInstance();
        singleon.show();
    }
}

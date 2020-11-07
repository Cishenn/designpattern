package com.behavioralpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteInterator implements Interator {
    List<Object> objectList=new ArrayList<Object>();
    protected int index=-1;
    @Override
    public boolean hasNext() {
        if(index<objectList.size()-1){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Interator next() {
        return null;
    }

    @Override
    public void addNext(Object o) {

    }
}

package com.behavioralpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    List<Object> objectList=new ArrayList<Object>();
    protected int index=-1;
    ConcreteIterator(List<Object> list){
        objectList=list;
    }
    @Override
    public boolean hasNext() {
        if(index<objectList.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            return objectList.get(++index);
        }else{
            return null;
        }
    }

    @Override
    public Object first() {
        index=0;
        Object obj=objectList.get(index);
        return obj;
    }
}

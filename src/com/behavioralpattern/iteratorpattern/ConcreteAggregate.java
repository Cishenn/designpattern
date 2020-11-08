package com.behavioralpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    List<Object> objectList=new ArrayList<Object>();
    @Override
    public void add(Object o) {
        objectList.add(o);
    }

    @Override
    public void remove(Object o) {
        objectList.remove(o);
    }

    @Override
    public Iterator getInterator() {
        return new ConcreteIterator(objectList);
    }
}

package com.behavioralpattern.visitorpattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {
    private List<Element> elementList=new ArrayList<Element>();

    public void accept(Visitor visitor){
        Iterator<Element> iterator=elementList.iterator();
        while(iterator.hasNext()){
            iterator.next().accept(visitor);
        }
    }

    public void add(Element element){
        elementList.add(element);
    }

    public void remove(Element element){
        elementList.remove(element);
    }
}

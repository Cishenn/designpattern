package com.designpatterndemo.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> children=new ArrayList<Component>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for(Object o:children){
            ((Component)o).operation();
        }
    }
}

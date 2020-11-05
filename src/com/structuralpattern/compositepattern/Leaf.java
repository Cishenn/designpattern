package com.designpatterndemo.compositepattern;

public class Leaf implements Component {
    private String name;
    Leaf(String name){
        this.name=name;
    }
    @Override
    public void add(Component component) {}

    @Override
    public void remove(Component component) {}

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("Leaf "+name+" is visited");
    }
}

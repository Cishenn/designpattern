package com.behavioralpattern.templatemethod;

public class TemplateMethodPattern {
    public static void main(String[] args){
        AbstractClass abstractClass=new ConcreteClass();
        abstractClass.templateMethod();
    }
}

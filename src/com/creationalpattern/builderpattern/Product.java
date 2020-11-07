package com.creationalpattern.builderpattern;

public class Product {
    private String Tire;
    private String Glass;
    private String Engine;
    private String seat;

    public String getTire() {
        return Tire;
    }

    public String getGlass() {
        return Glass;
    }

    public String getEngine() {
        return Engine;
    }

    public String getSeat() {
        return seat;
    }

    public void setTire(String tire) {
        Tire = tire;
    }

    public void setGlass(String glass) {
        Glass = glass;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Tire='" + Tire + '\'' +
                ", Glass='" + Glass + '\'' +
                ", Engine='" + Engine + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}

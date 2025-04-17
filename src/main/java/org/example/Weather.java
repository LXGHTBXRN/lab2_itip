package org.example;

public class Weather extends App {
    private String type;

    public Weather(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weather: " + getName() + ", type: " + type;
    }
}
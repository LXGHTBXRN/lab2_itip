package org.example;

public abstract class App {
    private String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "App{" + "name='" + name + '\'' + '}';
    }
}
package org.example;

public class Game extends App {
    private String classification;

    public Game(String name, String classification) {
        super(name);
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Game: " + getName() + ", classification: " + classification;
    }
}
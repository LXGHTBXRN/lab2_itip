package org.example;

public class SocialWeb extends App {
    private boolean availabillity;

    public SocialWeb(String name, boolean availabillity) {
        super(name);
        this.availabillity = availabillity;
    }

    @Override
    public String toString() {
        return "SocialWeb: " + getName() + ", Availability: " + availabillity;
    }
}
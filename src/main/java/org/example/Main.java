package org.example;

public class Main {
    public static void main(String[] args) {
        App SocialWeb = new SocialWeb ("Telegram", true);
        App Game = new Game ("CS2","FPS");
        App Weather = new Weather("Weather","cloudy");

        System.out.println(SocialWeb);
        System.out.println(Game);
        System.out.println(Weather);
    }
}
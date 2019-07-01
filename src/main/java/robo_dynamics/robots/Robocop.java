package main.java.robo_dynamics.robots;


import main.java.robo_dynamics.planets.Planet;

public class Robocop extends Android {

    public Robocop(String model, String type, String manufacturer, int year, boolean ai) {
        super(model, type, manufacturer, year, ai);
    }

    @Override
    public void adaptationToConditions(Planet planet) {
        if (planet == Planet.SUN) {
            System.out.println("I'm adaptation to condition planets Sun");
        } else if (planet == Planet.SEA) {
            System.out.println("I'm adaptation to condition planets Sea");
        } else if (planet == Planet.WIND) {
            System.out.println("I'm adaptation to condition planets Wind");
        } else {
            System.out.println("I'm adaptation to condition planets Earth");
        }
    }
}

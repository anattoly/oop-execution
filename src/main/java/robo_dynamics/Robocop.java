package main.java.robo_dynamics;


public class Robocop extends Android {

    public Robocop(String model, String type, String manufacturer, int year, boolean ai) {
        super(model, type, manufacturer, year, ai);
    }

    @Override
    public void adaptationToConditions(Planet planet) {
        if (planet == Planet.SUN) {
            System.out.println("I'm adaptation to condition planet Sun");
        } else if (planet == Planet.SEA) {
            System.out.println("I'm adaptation to condition planet Sea");
        } else if (planet == Planet.WIND) {
            System.out.println("I'm adaptation to condition planet Wind");
        } else {
            System.out.println("I'm adaptation to condition planet Earth");
        }
    }
}

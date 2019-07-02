package main.java.robo_dynamics.robots;


import main.java.robo_dynamics.planets.Planet;

public class Robocop extends Android {

    public Robocop(String model, String type, String manufacturer, int year, boolean ai) {
        super(model, type, manufacturer, year, ai);
    }

    @Override
    public void adaptationToConditions(Planet typePlanet) {
        if (Planet.A.equals(typePlanet)) {
            System.out.println(typePlanet.getTypeArmor());
        } else if (Planet.B.equals(typePlanet)) {
            System.out.println(typePlanet.getTypeArmor());
        } else if (Planet.C.equals(typePlanet)) {
            System.out.println(typePlanet.getTypeArmor());
        } else {
            System.out.println("I can't adaptation to condition this planet");
        }
    }
}

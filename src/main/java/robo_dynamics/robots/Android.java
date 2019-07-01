package main.java.robo_dynamics.robots;

import main.java.robo_dynamics.planets.Planet;
import main.java.robo_dynamics.operating_system.RobotSystem;

import java.util.Random;

public class Android extends Robot implements RobotSystem {

    private boolean artificialIntelligence;

    public Android(String model, String type, String manufacturer, int year, boolean ai) {
        super(model, type, manufacturer, year);
        artificialIntelligence = ai;
    }

    @Override
    public void move() {
        System.out.println("I can move like a man");
    }

    @Override
    public void getState(int healthyPoint) {

        if (healthyPoint <= 3) {
            System.out.println("Robot state 1");
        } else if (healthyPoint >= 9) {
            System.out.println("Robot state 3");
        } else {
            System.out.println("Robot state 2");
        }
    }

    @Override
    public void shoot() {
        if (artificialIntelligence) {
            System.out.println("Hasta la vista, baby");
        } else {
            System.out.println("I'm not shooting");
        }

    }


    @Override
    public void talk() {
        System.out.println("Hello, Space!!!");

    }

    @Override
    public void adaptationToConditions(Planet planet) {

    }

    public boolean isArtificialIntelligence() {
        return artificialIntelligence;
    }
}

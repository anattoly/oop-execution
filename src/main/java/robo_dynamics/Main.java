package main.java.robo_dynamics;

import main.java.robo_dynamics.planets.Planet;
import main.java.robo_dynamics.robots.Android;
import main.java.robo_dynamics.robots.Robocop;

import java.time.LocalTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Android robocop = new Robocop("K1", "Killer", "BostonDynamics", 10, true);

        //Robot talk
        robocop.talk();

        //Current Robot state
        int robotHealthyPoint = getHealthyPoint();
        robocop.getState(robotHealthyPoint);

        //Ability to shoot a robot
        robocop.shoot();

        //Ability to move a robot
        robocop.move();

        //Ability adaption to condition on planets
        robocop.adaptationToConditions(Planet.SUN);

        LocalTime currentTime = LocalTime.of(16, 00);
        System.out.println(currentTime);
    }

    private static int getHealthyPoint() {
        int min = 1;
        int max = 12;
        int diff = max - min;
        Random random = new Random();
        int getHealthyPoint = random.nextInt(diff + 1);
        getHealthyPoint += min;
        return getHealthyPoint;
    }


}

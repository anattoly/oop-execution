package main.java.robo_dynamics;

import main.java.robo_dynamics.planets.Planet;
import main.java.robo_dynamics.robots.Android;
import main.java.robo_dynamics.robots.Robocop;

import java.time.LocalTime;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Android robocop = new Robocop("K1", "Killer", "BostonDynamics", 10, true);


        if (LocalTime.now().isAfter(LocalTime.parse("00:00:00.000")) && LocalTime.now().isBefore(LocalTime.parse("04:59:59.999"))) {
            System.out.println("Robot charge");
        } else if (LocalTime.now().isAfter(LocalTime.parse("05:00:00.000")) && LocalTime.now().isBefore(LocalTime.parse("11:59:59.999"))) {

            robocop.getState(9, 12);
            robocop.move();
            robocop.talk();
            robocop.shoot();

        } else if (LocalTime.now().isAfter(LocalTime.parse("12:00:00.000")) && LocalTime.now().isBefore(LocalTime.parse("18:00:00.000"))) {

            robocop.getState(4, 8);
            robocop.move();
            robocop.talk();

        } else {

            robocop.getState(1, 3);
            robocop.talk();
        }

        //Ability adaption to condition on planets

        robocop.adaptationToConditions(Planet.SUN);


    }


}

package main.java.robo_dynamics;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Android robocop = new Robocop("K1", "Killer", "BostonDynamics", 10, true);


        //Robot talk
        robocop.talk();

        //Current Robot state
        int robotState = robocop.getState();
        System.out.println(robotState);

        //Ability to shoot a robot
        robocop.shoot();

        //Ability to move a robot
        robocop.move();

        //Ability adaption to condition on planet
        robocop.adaptationToConditions(Planet.SUN);
    }
}

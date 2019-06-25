package main.java.robo_dynamics;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Android r1 = new Robocop("R1", "Killer", "BostonDynamics", 10, true);


        r1.talk();

        int robotState = r1.getState();
        System.out.println(robotState);

        r1.shoot();

        r1.move();
    }
}

package main.java.robo_dynamics;

import main.java.robo_dynamics.planets.Planet;
import main.java.robo_dynamics.robots.Android;
import main.java.robo_dynamics.robots.Robocop;

import java.time.LocalTime;
import java.util.*;

public class Main {

    private static final List<Planet> VALUES =
            Collections.unmodifiableList(Arrays.asList(Planet.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Android robocop = new Robocop(
                                    "K1",
                                    "Killer",
                                    "BostonDynamics",
                                    10,
                                    true);

        if (LocalTime.now().isAfter(LocalTime.parse("00:00:00.001"))
                && LocalTime.now().isBefore(LocalTime.parse("04:59:59.999"))) {

            System.out.println("Robot charge");

        } else if (LocalTime.now().isAfter(LocalTime.parse("05:00:00.000"))
                && LocalTime.now().isBefore(LocalTime.parse("11:59:59.999"))) {

            robocop.getState(9, 12);
            robocop.move();
            robocop.talk();
            robocop.shoot();
            robocop.adaptationToConditions(randomPlanet());

        } else if (LocalTime.now().isAfter(LocalTime.parse("12:00:00.000"))
                && LocalTime.now().isBefore(LocalTime.parse("18:00:00.000"))) {

            robocop.getState(4, 8);
            robocop.move();
            robocop.talk();
            robocop.adaptationToConditions(randomPlanet());

        } else {

            robocop.getState(1, 3);
            robocop.talk();
            robocop.adaptationToConditions(randomPlanet());
        }


    }

    public static Planet randomPlanet() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}

package main.java.robo_dynamics.operating_system;

import main.java.robo_dynamics.planets.Planet;

public interface RobotSystem {

    int getState();

    void shoot();

    void talk();

    void adaptationToConditions(Planet planet);

}

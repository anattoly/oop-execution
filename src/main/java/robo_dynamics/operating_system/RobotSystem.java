package main.java.robo_dynamics.operating_system;

import main.java.robo_dynamics.planets.Planet;

public interface RobotSystem {

    void getState(int minHealthyPoint, int maxHealthyPoint);

    void shoot();

    void talk();

    void adaptationToConditions(Planet typePlanet);

}

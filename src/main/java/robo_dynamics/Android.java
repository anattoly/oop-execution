package main.java.robo_dynamics;

import java.util.Random;

public class Android extends Robot implements RobotSystem{

    private boolean artificialIntelligence;

    public Android(String model, String type, String manufacturer, int year, boolean ai) {
        super(model, type, manufacturer, year);
        ai = artificialIntelligence;
    }

    @Override
    public void move() {
        System.out.println("I can move like a man");
    }

    @Override
    public int getState() {
        int min = 1;
        int max = 12;
        int diff = max - min;
        Random random = new Random();
        int healthyPoint = random.nextInt(diff + 1);
        healthyPoint += min;

        if (healthyPoint <= 3) {
            return 1;
        } else if (healthyPoint >= 9){
            return  3;
        } else {
            return  2;
        }
    }

    @Override
    public void shoot() {
        System.out.println("Hasta la vista, baby");

    }

    @Override
    public void talk() {
        System.out.println("Hello, Space!!!");

    }

    @Override
    public void adaptationToConditions() {

    }

    public boolean isArtificialIntelligence() {
        return artificialIntelligence;
    }
}

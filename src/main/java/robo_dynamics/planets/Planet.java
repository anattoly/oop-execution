package main.java.robo_dynamics.planets;

public enum Planet {
    A("My armor adaptation to condition planet SEA"),
    B("My armor adaptation to condition planet WIND"),
    C("My armor adaptation to condition planet SUN");

    private String typeArmor;

    Planet(String typeArmor) {
        this.typeArmor = typeArmor;

    }

    public String getTypeArmor() {
        return typeArmor;
    }

}

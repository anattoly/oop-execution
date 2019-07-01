package main.java.robo_dynamics.robots;

public class Robot {

    private String model;
    private String type;
    private String manufacturer;
    private int year;

    public Robot(String model, String type, String manufacturer, int year) {
        this.model = model;
        this.type = type;
        this.manufacturer = manufacturer;
        this.year = year;
    }


    public void move() {
        System.out.println("I can move on tracks");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

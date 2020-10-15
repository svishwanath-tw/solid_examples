package com.dnivra26fixed;

abstract class Vehicle {
    abstract public int findAir();
}

class Auto extends Vehicle {

    public int getFrontTyreAir() {
        return frontTyreAir;
    }

    public int getBackLeftTyreAir() {
        return backLeftTyreAir;
    }

    public int getBackRightTyreAir() {
        return backRightTyreAir;
    }

    public Auto(int frontTyreAir, int backLeftTyreAir, int backRightTyreAir) {
        this.frontTyreAir = frontTyreAir;
        this.backLeftTyreAir = backLeftTyreAir;
        this.backRightTyreAir = backRightTyreAir;
    }


    private int frontTyreAir, backLeftTyreAir, backRightTyreAir;

    @Override
    public int findAir() {
        return frontTyreAir + backLeftTyreAir + backRightTyreAir;
    }
}

class Bike extends Vehicle {

    public int getFrontTyreAir() {
        return frontTyreAir;
    }

    public int getBackTyreAir() {
        return backTyreAir;
    }

    public Bike(int frontTyreAir, int backTyreAir) {
        this.frontTyreAir = frontTyreAir;
        this.backTyreAir = backTyreAir;
    }

    private int frontTyreAir, backTyreAir;

    @Override
    public int findAir() {
        return frontTyreAir + backTyreAir;
    }
}


public class O_AirChecker {

    public int findAirLeft(Vehicle vehicle) {
        return vehicle.findAir();
    }

    public static void main(String[] args) {
        O_AirChecker airChecker = new O_AirChecker();
        Vehicle auto = new Auto(1, 2, 3);
        Vehicle bike = new Bike(1, 2);
        System.out.println(airChecker.findAirLeft(auto));
        System.out.println(airChecker.findAirLeft(bike));
    }

}
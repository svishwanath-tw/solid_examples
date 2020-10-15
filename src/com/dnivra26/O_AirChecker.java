package com.dnivra26;

class Auto {

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

}

class Bike {

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

}


public class L_AirChecker {

    public int findAirLeft(Object vehicle) {
        if (vehicle.getClass() == Auto.class) {
            return ((Auto) vehicle).getBackLeftTyreAir() + ((Auto) vehicle).getBackRightTyreAir() + ((Auto) vehicle).getFrontTyreAir();
        } else {
            return ((Bike) vehicle).getBackTyreAir() + ((Bike) vehicle).getFrontTyreAir();
        }
    }

    public static void main(String[] args) {
        AirChecker airChecker = new AirChecker();
        Auto auto = new Auto(1, 2, 3);
        Bike bike = new Bike(1, 2);
        System.out.println(airChecker.findAirLeft(auto));
        System.out.println(airChecker.findAirLeft(bike));
    }

}

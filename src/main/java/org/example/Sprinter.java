package org.example;

public class Sprinter extends Sportsmen implements SportmenInterface{
    private double footSize;
    private double speed;

    public Sprinter(String name, int age, double weight, double height, double footSize, double speed) {
        super(name, age, weight, height);
        this.footSize = footSize;
        this.speed = speed;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Sprinter " + getName();
    }

    @Override
    public void sayAboutMe() {
        System.out.println("I am a better sprinter, because my maximum speed is " + speed + "!   ---   Interface method");
    }

    @Override
    public void sayAboutMeAgain() {
        System.out.println("I am a better sprinter, because my maximum speed is " + speed + "!   ---   Abstract method");
    }

    @Override
    public int getAvgStats() {
        return (int) ((getHeight() + footSize + speed) / 3);
    }
}

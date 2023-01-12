package org.example;

public class ChessPlayer extends Sportsmen implements SportmenInterface{
    private int iq;
    private int rating;

    public ChessPlayer(String name, int age, double weight, double height, int iq, int rating) {
        super(name, age, weight, height);
        this.iq = iq;
        this.rating = rating;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Chess player " + getName();
    }

    @Override
    public void sayAboutMe() {
        System.out.println("I am a better chess player, because my IQ is " + iq + ", and my rating " + rating + " points!   ---   Interface method");
    }

    @Override
    public void sayAboutMeAgain() {
        System.out.println("I am a better chess player, because my IQ is " + iq + ", and my rating " + rating + " points!   ---   Abstract method");
    }

    @Override
    public int getAvgStats() {
        return (iq + rating) / 2;
    }
}

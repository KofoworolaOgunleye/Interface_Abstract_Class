package main.java.org.example;

public class Aeroplane extends  Vehicle implements Flyable{
    @Override
    public void move() {
        System.out.println("Aeroplane is flying.");
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane is flying.");
    }
}

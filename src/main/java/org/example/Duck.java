package main.java.org.example;

public class Duck extends Bird implements Swimmable{
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

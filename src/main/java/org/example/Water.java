package main.java.org.example;

public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {
        for (Swimmable swimmable : traffic){
            swimmable.swim();
        }
    }
}

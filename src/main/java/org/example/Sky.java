package main.java.org.example;

public class Sky extends Environment<Flyable>{
    @Override
    public void checkTraffic() {
//        super.traffic.forEach(e -> e.fly());
//        super.traffic.forEach(Flyable::fly);

        for (Flyable flyable : traffic){
            flyable.fly();
        }
    }
}

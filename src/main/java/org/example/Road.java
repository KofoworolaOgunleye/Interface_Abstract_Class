package main.java.org.example;

public class Road extends Environment<Vehicle>{
    @Override
    public void checkTraffic() {
        for (Vehicle vehicle:traffic){
            vehicle.move();
        }
    }
}

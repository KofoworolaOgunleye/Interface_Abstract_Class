package main.java.org.example;
import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> { //lets the class work with different types without being tied to one specific type. eg Environment<Animal> or Environment<Vehicle>.

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }
    public void checkVehicles(){
        for (T vehicle:traffic){
            if (vehicle instanceof Vehicle){
                ((Vehicle) vehicle).move();
            }
        }
    }

}

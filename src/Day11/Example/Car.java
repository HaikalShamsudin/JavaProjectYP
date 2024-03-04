package Day11.Example;

public class Car implements VehicleTrait {

    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
    
}

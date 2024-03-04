package Day11.Example;

public class Truck implements VehicleTrait, ExtraFunctionalityTrait {

    @Override
    public void honk() {
        System.out.println("Truck honking");
    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");

    }

}

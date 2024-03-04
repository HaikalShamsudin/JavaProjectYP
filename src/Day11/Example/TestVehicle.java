package Day11.Example;

public class TestVehicle {
    public static void main(String[] args) {
        VehicleTrait car = new Car();
        car.start();
        car.start();
        // we hide stop method

        VehicleTrait truck = new Truck();
        truck.start();
        truck.start(); 
        // we hide stop method

        // Example of aliasing traits (traits can be expanded)
        ExtraFunctionalityTrait truckWithAlias = new Truck();
        truckWithAlias.honk(); // Truck provides its own honk method

    }
}

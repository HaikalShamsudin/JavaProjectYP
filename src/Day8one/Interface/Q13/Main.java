package Day8one.Interface.Q13;

public class Main {
    
    public static void main(String[] args) {
        
        //create an object for pressure and temperature
        PressureSensor pressureSensor = new PressureSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //measure and calibrate the pressure and temperature
        temperatureSensor.measure();
        temperatureSensor.calibrate();
        System.out.println();

        pressureSensor.measure();;
        pressureSensor.calibrate();

    }
}

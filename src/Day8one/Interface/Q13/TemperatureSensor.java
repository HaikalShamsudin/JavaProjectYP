package Day8one.Interface.Q13;

public class TemperatureSensor implements Sensor {

    private double temp;

    @Override
    public void measure() {
        temp = Math.random() * 100;
        String formattedTemperature = String.format("%.2f", temp);
        System.out.println("Measured temperature: " + formattedTemperature + " degrees");

    }

    @Override
    public void calibrate() {
        System.out.println("Temperature Sensor is being calibrated!");
    }
    
}

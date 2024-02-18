package Day8one.Interface.Q13;

public class PressureSensor implements Sensor {

    private double pressure;

    @Override
    public void measure() {
        pressure = Math.random() * 1000;
        String formattedPressure = String.format("%.2f", pressure);
        System.out.println("Measured pressure: " + formattedPressure + " kPa");
       
    }
    
    
    @Override
    public void calibrate() {
        System.out.println("Pressure Sensor is being calibrated!");
    }
    
}

package sensors;
import java.util.Random;

public class MoistureSensor implements Sensor 
{
    private final Random rand = new Random(); // Random number generator used to simulate sensor data.
    @Override
    public String getName() 
    {
        return "Moisture Sensor";
    }
     @Override
    public double readValue() 
    {
        return 10 + rand.nextDouble() * 80; // Simulate soil moisture between 10% and 90%.
    }
}

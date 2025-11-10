package sensors;
import java.util.Random;

public class PhSensor implements Sensor 
{
    private final Random rand = new Random(); // Random number generator used to simulate sensor readings.

    @Override
    public String getName() 
    {
        return "pH Sensor";
    }

    @Override
    public double readValue() 
    {
        return 4.0 + rand.nextDouble() * 4.0; // Simulate soil pH between 4.0 and 8.0.
    }
}

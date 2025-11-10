import sensors.*; 
import logic.SoilAnalyzer; 

public class Main // The loop represents a real-time data feed from IoT sensors in a farm field.
{
    public static void main(String[] args) throws InterruptedException 
    {
        Sensor moistureSensor = new MoistureSensor();
        Sensor phSensor = new PhSensor();

        System.out.println("🌿 Soil Quality Monitoring System 🌿\n"); //Initializantion.

        try
        {
            while (true) 
            {
                // Read simulated data from sensors
                double moisture = moistureSensor.readValue();
                double ph = phSensor.readValue();

                System.out.printf("Moisture: %.2f%% | pH: %.2f\n", moisture, ph); //Display current readings.

                String insights = SoilAnalyzer.analyze(moisture, ph); // Analyze readings and generate insights.
                System.out.println(insights);
                System.out.println("-------------------------------------------------\n");

                Thread.sleep(3000); // update every 3 seconds.
            }
        } catch (InterruptedException e) 
        {
            System.out.println("\nInterrupted — shutting down.");
            Thread.currentThread().interrupt();
        }
    }
}

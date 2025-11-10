package logic;

public class SoilAnalyzer 
{
    public static String analyze(double moisture, double ph) // Analyzes soil data and provides actionable feedback.
    {
        StringBuilder report = new StringBuilder();

        // Moisture analysis.
        if (moisture < 30)
        report.append("⚠️ Soil is too dry. Water required.\n");

        else if (moisture > 70)
        report.append("💧 Soil is too wet. Reduce irrigation.\n");

        else
        report.append("✅ Moisture level is optimal.\n");

        // pH analysis.
        if (ph < 5.5)
        report.append("⚠️ Soil is too acidic. Add lime.\n");

        else if (ph > 7.5)
        report.append("⚠️ Soil is too alkaline. Add sulfur.\n");

        else
        report.append("✅ pH level is good for most crops.\n");

        return report.toString();
    }
}

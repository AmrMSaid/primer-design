package primerdesign_b025;

public class PrimerSetting {

    public static int minSize = 18;
    public final static int OPTIMAL_SIZE = 20;
    public static int maxSize = 27;
    public static int minTemperature = 57;
    public final static int OPTIMAL_TEMPERATURE = 60;
    public static int maxTemperature = 63;
    public static double minCG = 0.2;
    public static double optimalCG = 0.4;
    public static double maxCG = 0.6;

    public PrimerSetting() {
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        PrimerSetting.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        PrimerSetting.maxSize = maxSize;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        PrimerSetting.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        PrimerSetting.maxTemperature = maxTemperature;
    }

    public double getMinCG() {
        return minCG;
    }

    public void setMinCG(double minCG) {
        PrimerSetting.minCG = minCG;
    }

    public double getOptimalCG() {
        return optimalCG;
    }

    public void setOptimalCG(double optimalCG) {
        PrimerSetting.optimalCG = optimalCG;
    }

    public double getMaxCG() {
        return maxCG;
    }

    public void setMaxCG(double maxCG) {
        PrimerSetting.maxCG = maxCG;
    }

}

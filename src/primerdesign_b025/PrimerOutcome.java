package primerdesign_b025;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

enum PrimerType {
    FORWARD, REVERSE
}

public class PrimerOutcome {

    private String sequence;
    private int startIndex;
    private int length;
    private double temperature;
    private double CG;
    private PrimerType type;
    private final DecimalFormat df = new DecimalFormat("##.##");

    public PrimerOutcome(String sequence, int startIndex, int length, double temperature, double CG, PrimerType type) {
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.length = length;
        this.temperature = temperature;
        this.CG = CG;
        this.type = type;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getCG() {
        return CG;
    }

    public void setCG(double CG) {
        this.CG = CG;
    }

    public PrimerType getType() {
        return type;
    }

    public void setType(PrimerType type) {
        this.type = type;
    }

    public static void sortOptimal(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size(); i++) {
            if (primerOutcomes.get(i).getLength() == PrimerSetting.OPTIMAL_SIZE && primerOutcomes.get(i).getTemperature() == PrimerSetting.OPTIMAL_TEMPERATURE && primerOutcomes.get(i).getCG() == PrimerSetting.optimalCG) {
                PrimerOutcome temp = primerOutcomes.get(i);
                primerOutcomes.remove(i);
                primerOutcomes.add(0, temp);
            }
        }
    }

    public static void sortLength(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getLength() - PrimerSetting.OPTIMAL_SIZE) > Math.abs(primerOutcomes.get(j + 1).getLength() - PrimerSetting.OPTIMAL_SIZE)) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }

    public static void sortTm(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getTemperature() - PrimerSetting.OPTIMAL_TEMPERATURE) > Math.abs(primerOutcomes.get(j + 1).getTemperature() - PrimerSetting.OPTIMAL_TEMPERATURE)) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }

    public static void sortCG(ArrayList<PrimerOutcome> primerOutcomes) {
        for (int i = 0; i < primerOutcomes.size() - 1; i++) {
            for (int j = 0; j < primerOutcomes.size() - i - 1; j++) {
                if (Math.abs(primerOutcomes.get(j).getCG() - PrimerSetting.optimalCG) > Math.abs(primerOutcomes.get(j + 1).getCG() - PrimerSetting.optimalCG)) {
                    Collections.swap(primerOutcomes, j, j + 1);
                }
            }
        }
    }

    public String display(int i) {
        String s = type.toString() + " PRIMER " + (int) (i + 1) + ":\n"
                + sequence
                + "\n\nStart index:  " + startIndex
                + "\nLength:        " + (int) Math.rint(length) + " bp\n"
                + "Tm:               " + (int) Math.rint(temperature) + " °C\n"
                + "CG%:           " + df.format(CG * 100) + "%\n_____________\n";
        return s;
    }
}

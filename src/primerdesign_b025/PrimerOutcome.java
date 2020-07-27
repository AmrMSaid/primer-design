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

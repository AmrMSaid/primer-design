package primerdesign_b025;

import java.text.DecimalFormat;

//Abstraction
public abstract class PrimerOutcome {

    private String sequence;
    private int startIndex;
    private int length;
    private double temperature;
    private double CG;
    private final DecimalFormat df = new DecimalFormat("##.##");

    public PrimerOutcome(String sequence, int startIndex, int length, double temperature, double CG) {
        this.sequence = sequence;
        this.startIndex = startIndex;
        this.length = length;
        this.temperature = temperature;
        this.CG = CG;
    }

    //Encapsulation
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

    public String toString(int primerIndex) {
        String outputString = " Primer " + (int) (primerIndex + 1) + ":\n"
                + sequence
                + "\n\nStart index:  " + startIndex
                + "\nLength:        " + (int) Math.rint(length) + " bp\n"
                + "Tm:               " + (int) Math.rint(temperature) + " °C\n"
                + "CG%:           " + df.format(CG * 100) + "%\n_____________\n";
        return outputString;
    }
}

class ForwardPrimer extends PrimerOutcome {

    public ForwardPrimer(String sequence, int startIndex, int length, double temperature, double CG) {
        super(sequence, startIndex, length, temperature, CG);
    }

    //Polymorphism
    @Override
    public String toString(int primerIndex) {
        String outputString = "Forward" + super.toString(primerIndex);
        return outputString;
    }
}

class ReversePrimer extends PrimerOutcome {

    public ReversePrimer(String sequence, int startIndex, int length, double temperature, double CG) {
        super(sequence, startIndex, length, temperature, CG);
    }

    //Polymorphism
    @Override
    public String toString(int primerIndex) {
        String outputString = "Reverse" + super.toString(primerIndex);
        return outputString;
    }
}
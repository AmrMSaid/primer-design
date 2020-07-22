package primerdesign_b025;

enum PrimerType {
    FORWARD, REVERSE
}

public class PrimerOutcome {

    String sequence;
    int startIndex;
    int length;
    int temperature;
    double CG;
    PrimerType type;

    public PrimerOutcome(String sequence, int startIndex, int length, int temperature, double CG, PrimerType type) {
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
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
    
    
}

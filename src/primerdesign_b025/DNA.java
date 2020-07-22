package primerdesign_b025;

public class DNA extends NucleicAcid {

    private int startIndex;
    private int endIndex;
    
    public DNA(String secuence) {
        super(secuence);
    }

    public DNA(int startIndex, int endIndex, String secuence) {
        super(secuence);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

}

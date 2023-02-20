package primerdesign_b025;

//Abstraction
public abstract class NucleicAcid {

    private String sequence;

    public NucleicAcid(String secuence) {
        this.sequence = secuence;
    }

    //Encapsulation
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

}

package primerdesign_b025;

//Inheritance
public class RNA extends NucleicAcid {

    public RNA(String secuence) {
        super(secuence);
    }

    public DNA convertToDNA() {
        return new DNA(super.getSequence().replace('U', 'T'));
    }
}

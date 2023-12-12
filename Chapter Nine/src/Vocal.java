public class Vocal extends Instrument {
    public Vocal(String singerName) {
        super(singerName);
    }

    public String makeSound() {
        return "la la la";
    }

    public String toString() {
        return (super.getMusician() + " sings " + makeSound());
    }
}

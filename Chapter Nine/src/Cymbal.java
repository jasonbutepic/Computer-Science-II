public class Cymbal extends Percussion{
    public Cymbal(String cymbalist) {
        super(cymbalist);
    }

    public String makeSound() {
        return "crash";
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound());
    }
}

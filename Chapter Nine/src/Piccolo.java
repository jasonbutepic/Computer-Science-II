public class Piccolo extends Woodwind {
    public Piccolo(String piccoloist) {
        super(piccoloist);
    }

    public String makeSound() {
        return "peep";
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound());
    }
}

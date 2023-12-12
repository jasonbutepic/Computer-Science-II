public class Drum extends Percussion {
    public Drum(String drummer) {
        super(drummer);
    }

    public String makeSound() {
        return "ba-dum";
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound());
    }
}

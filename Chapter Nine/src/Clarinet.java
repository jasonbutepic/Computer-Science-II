public class Clarinet extends Woodwind{
    public Clarinet (String clarinetist) {
        super(clarinetist);
    }

    public String makeSound() {
        return "squawk";
    }

    public String toString() {
        return (super.getMusician() + " plays " + makeSound());
    }
}

public class Minivan extends Vehicle{
    private int seatingCapacity;

    public Minivan(String name, String color, int weight, int year, int seatingCapacity) {
        super(name, color, weight, year);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void move() {
        System.out.println("The minivan is moving");
    }

    public String toString() {
        return "Name: " + getName() + "\nColor: " + getColor() + "\nWeight: " + getWeight() + "\nYear: " + getYear();
    }
}

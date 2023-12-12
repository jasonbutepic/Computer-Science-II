public class Truck extends Vehicle{
    private int towingCapacity;

    public Truck(String name, String color, int weight, int year, int towingCapacity) {
        super(name, color, weight, year);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void move() {
        System.out.println("The truck is moving");
    }

    public String toString() {
        return "Name: " + getName() + "\nColor: " + getColor() + "\nWeight: " + getWeight() + "\nYear: " + getYear();
    }
}

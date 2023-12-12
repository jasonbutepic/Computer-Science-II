public class Car extends Vehicle{
    private int engineCapacity;

    public Car(String name, String color, int weight, int year, int engineCapacity) {
        super(name, color, weight, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void move() {
        System.out.println("The car is moving");
    }

    public String toString() {
        return "Name: " + getName() + "\nColor: " + getColor() + "\nWeight: " + getWeight() + "\nYear: " + getYear();
    }
}

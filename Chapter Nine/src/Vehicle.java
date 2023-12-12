abstract class Vehicle {
    private String name;
    private String color;
    private int weight;
    private int year;

    public Vehicle(String name, String color, int weight, int year) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public abstract void move();
}

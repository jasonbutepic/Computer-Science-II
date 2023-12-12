public class UEmployee {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        String information = "Name: " + name + "\nSalary: " + salary;
        return information;
    }
}

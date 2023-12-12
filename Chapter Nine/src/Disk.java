public class Disk extends Circle {
    private double thickness;

    public Disk (double r, double t) {
        super(r);
        thickness = t;
    }

    public void setThickness(double newThickness) {
        thickness = newThickness;
    }

    public double getThickness() {
        return thickness;
    }

    public double volume() {
        double v;

        v = super.area() * thickness;
        return v;
    }

    public boolean equals(Object d) {
        Disk testObj = (Disk) d;
        if (testObj.getRadius() == getRadius() && testObj.getThickness() == thickness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String information = ("The radius is: " + getRadius() + " and the thickness is: " + thickness);
        return information;
    }
}

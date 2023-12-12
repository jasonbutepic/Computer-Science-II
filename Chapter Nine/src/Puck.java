public class Puck extends Disk {

    public Puck(double r, double t) {
        super(r, t);
    }
    
    double weight;
    boolean standard, youth;

    Puck (double w) {
        super(1.5, 1);
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public String getDivision() {
        if (weight >= 5 && weight <= 5.5) {
            standard = true;
            return "This hockey puck is in standard division.";
        } else if (weight >= 4 && weight <= 4.5) {
            youth = true;
            return "This hockey puck is in youth division.";
        } else {
            return "This hockey puck is not in any division.";
        }
    }
//puck1.equals(puck2)
    public String toString() {
        String information = ("The radius is: " + getRadius() + " and the thickness is: " + getThickness() + " and the weight is: " + weight);
        return information;
    }

    public boolean equals(Object p) {
        Puck testObj = (Puck) p;
        if (testObj.getRadius() == getRadius() && testObj.getThickness() == getThickness() && testObj.getWeight() == weight) {
            return true;
        } else {
            return false;
        }
    }


}

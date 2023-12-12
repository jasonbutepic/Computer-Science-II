public class Circle {
    //instance variable
    private double radius;
    private String color;

    //constructor
    public Circle(){
        radius = 1;
    }

    //constructor and parameters
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    //getter
    public double getRadius(){
        return radius;
    }

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public static void CircumferenceFormula(){
        System.out.println("Circumference = 2 * PI * radius");
    }

    public boolean equals(Object c){
        Circle testObj = (Circle) c;
        if (testObj.getRadius() == radius){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String information = ("The radius is: " + radius);
        return information;
    }
}

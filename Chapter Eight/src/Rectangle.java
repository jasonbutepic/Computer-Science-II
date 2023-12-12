public class Rectangle {
    //instance variable
    private double length;
    private double width;
     
    //constructor
    public Rectangle(){
        length = 1;
        width = 1;
    }

    //constructors and parameters
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void AreaFormula(){
        System.out.println("Area = length * width");
    }

    public double area(double length, double width){
        return length * width;
    }

    public double perimeter(double length, double width){
        return 2 * (length + width);
    }

    public int compareTo(Object r){
        Rectangle testObj = (Rectangle) r;
        if (this.length < testObj.length || this.width < testObj.width){
            return -1;
        } else if (this.length == testObj.length || this.width == testObj.width){
            return 0;
        } else {
            return 1;
        }
    }

    public interface ComparableArea {
        int compareToArea(Object obj);
    }

    public int compareToArea(Object r){
        Rectangle testObj = (Rectangle) r;
        if (this.length * this.width < testObj.length * testObj.width){
            return -1;
        } else if (this.length * this.width == testObj.length * testObj.width){
            return 0;
        } else {
            return 1;
        }
    }

    public String toString(){
        String information = ("The length is: " + length + " and the width is: " + width);
        return information;
    }
}

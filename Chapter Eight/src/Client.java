public class Client implements ComparableArea {
        public static void main(String[] args) {
        Rectangle spot1 = new Rectangle(8, 4);
        Rectangle spot2 = new Rectangle(5, 10);

        System.out.println("The length of spot 1 is: " + spot1.getLength() + " and the width is: " + spot1.getWidth());
        System.out.println("The length of spot 2 is: " + spot2.getLength() + " and the width is: " + spot2.getWidth());

        Rectangle.AreaFormula();
        System.out.println("The length of spot 1 is: " + spot1.getLength() + " and the width is: " + spot1.getWidth());
        System.out.println("The area of spot 1 is: " + spot1.area(spot1.getLength(), spot1.getWidth()));
        System.out.println("The perimeter of spot 1 is: " + spot1.perimeter(spot1.getLength(), spot1.getWidth()));
        System.out.println("The area of spot 2 is: " + spot2.area(spot2.getLength(), spot2.getWidth()));
        System.out.println("The perimeter of spot 2 is: " + spot2.perimeter(spot2.getLength(), spot2.getWidth()));
        System.out.println(spot1.compareTo(spot2));
        System.out.println(spot1.compareToArea(spot2));
        }
}

/*
        Circle spot1 = new Circle();
        Circle spot2 = new Circle(8);
        Circle spot3 = new Circle(8, "blue");

        System.out.println("The radius of spot 1 is: " + spot1.getRadius());
        System.out.println("The radius of spot 2 is: " + spot2.getRadius());

        spot1.setRadius(3);

        System.out.println("The radius of spot 1 is: " + spot1.getRadius());
        System.out.println("The radius of spot 3 is: " + spot3.getRadius() + " and the color is: " + spot3.getColor());

        spot3.setColor("red");

        System.out.println("The color of spot 3 is: " + spot3.getColor());
        System.out.println("The area of spot 3 is: " + spot3.area(spot3.getRadius()));

        Circle.CircumferenceFormula();

        System.out.println(spot2.equals(spot3));
        System.out.println(spot1.equals(spot3));
        System.out.println(spot2.toString());
*/
/*
        Rectangle spot1 = new Rectangle();
        Rectangle spot2 = new Rectangle(5, 10);

        System.out.println("The length of spot 1 is: " + spot1.getLength() + " and the width is: " + spot1.getWidth());
        System.out.println("The length of spot 2 is: " + spot2.getLength() + " and the width is: " + spot2.getWidth());

        spot1.setLength(8);
        spot1.setWidth(4);

        Rectangle.AreaFormula();
        System.out.println("The length of spot 1 is: " + spot1.getLength() + " and the width is: " + spot1.getWidth());
        System.out.println("The area of spot 1 is: " + spot1.area(spot1.getLength(), spot1.getWidth()));
        System.out.println("The perimeter of spot 1 is: " + spot1.perimeter(spot1.getLength(), spot1.getWidth()));
        System.out.println("The area of spot 2 is: " + spot2.area(spot2.getLength(), spot2.getWidth()));
        System.out.println("The perimeter of spot 2 is: " + spot2.perimeter(spot2.getLength(), spot2.getWidth()));
*/
/*
        public static void main(String[] args){
       Coin nickel = new Coin();

        nickel.flipCoin();

       System.out.println(nickel.toString());
    }
*/
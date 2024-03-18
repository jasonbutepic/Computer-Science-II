public class DetectColonies {

    public static void main(String[] args) {

        Slide culture = new Slide("slide.dat");
        culture.displaySlide();
        culture.displayColonies();
    }
}

/* 
To have this program detect colonies diagonal to it, it would need to do (row + 1, col +1), (row - 1, col - 1), etc. 
The colonies reported would be at (1,3) with a size of 17, and (1,6) with a size of 4.

The slide that will be outputted by the second displaySlide() method will be all non colonies.
This is because the program deltes colonies after it counts them so it doesn't recount them.
*/

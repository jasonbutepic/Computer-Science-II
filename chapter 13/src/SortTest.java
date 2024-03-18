import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(3);
        cars.add(5);
        cars.add(1);
        cars.add(6);
        cars.add(7);
        cars.add(2);
        cars.add(4);
        Collections.sort(cars);  // Sort cars
        for (Integer i : cars) {
          System.out.println(i);
        }
      }
}

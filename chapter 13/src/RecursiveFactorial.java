// Set the source level to 21 or above
public class RecursiveFactorial {
    public static int factorial(int num) {

        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int x = factorial(6);
        System.out.println(x);
    }
}
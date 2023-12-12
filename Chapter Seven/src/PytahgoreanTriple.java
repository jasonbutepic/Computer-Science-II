public class PytahgoreanTriple {
    public static void main(String[] args) {
        int a, b;
        for (a = 1; a <= 100; a++) {
            for (b = 1; b <= 100; b++) {               
                    if (perfectSquare(a, b) == true && a < b) {
                        System.out.println(a + " " + b + " " + (int) Math.sqrt(a * a + b * b));
                    }
            }
        }
    }

    public static boolean perfectSquare(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        if (c == (int) c) {
            return true;
        } else {
            return false;
        }

    }
}

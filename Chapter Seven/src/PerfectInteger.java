public class PerfectInteger {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPerfect(i) == true) {
            System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int n) {
       int sum = 0;
         for (int i = 1; i < n; i++) {
              if (n % i == 0) {
                sum += i;
              }
         }
            if (sum == n) {
            return true;
            } else {
            return false;
            }
    }
}

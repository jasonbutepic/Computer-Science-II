import java.util.Scanner;

public class PrimeNumber {
    
public static void main(String[] args) {
        int user;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        user = input.nextInt();
        
        if (isPrime(user)) {
            System.out.println(user + " is prime.");
        } else {
            System.out.println(user + " is not prime.");
        }
    }
    
    private static boolean isPrime(int user) {
        boolean prime = true;
        for (int i = 2; i < user; i++) {
            if (user % i == 0) {
                prime = false;
            }
        }
        return prime;
}

}

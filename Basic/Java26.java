import java.util.*;

public class Java26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean isPrime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
            isPrime = true;
                break;
            }
        }
        System.out.println(number + (isPrime ? "is Prime number." : "is not a prime number."));
    }
}

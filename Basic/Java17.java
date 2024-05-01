import java.util.*;

public class Java17 {

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();

        int result = Sum(a, b);
        System.out.println("The sum is: " + result);
    }
}

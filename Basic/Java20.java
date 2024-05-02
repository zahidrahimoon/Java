import java.util.Scanner;

public class Java20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = sc.nextInt();

        System.out.println("Enter the number");
        int n2 = sc.nextInt();

        int m = n1;
        int n = n2;

        while (n1!=n2) {
            if (n1>n2) {
                n1 = n1-n2;
            }
            else{
                n2 = n2-n1;
            }
        }
        System.out.println("GCD("+m+","+n+")="+n1);
		System.out.println("LCM("+m+","+n+")="+(m*n)/n1);
    }
}

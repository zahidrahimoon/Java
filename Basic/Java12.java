import java.util.*;

public class Java12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age of the person");
       int age = sc.nextInt();

       if (age < 18) {
        System.out.println("He is not of 18 years old");
       }
       else{
        System.out.println("He is 18 years old");
       }
    }
}

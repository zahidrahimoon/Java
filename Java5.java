import java.util.*;
public class Java5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number one");
         int  a= sc.nextInt();
         System.out.println("Enter the number two");
         int  b= sc.nextInt();
         

         if (a > b) {
            System.out.println(a + " is greater than " + b);            
         }
         else if (a < b) {
            System.out.println(a + " is lesser than " + b);            
         }
         else if (a == b) {
            System.out.println(a + " is equal to " + b);            
         }
         else {
            System.out.println("Invalid");
         }
    }
}

import java.util.*;
public class Java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("Zahid");
                break;
            case 2:
                System.out.println("Hassan");
                break;
            case 3:
                System.out.println("Moni");
                break;
            case 4:
                System.out.println("Zuni");
                break;
            case 5:
                System.out.println("Junaid");
                break;
        
            default:
                break;
        }
    }
}

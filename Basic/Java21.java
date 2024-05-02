public class Java21 {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int rev;
        int x2 = x;
        while (x != 0) {
            rev = x % 10;
            sum = sum * 10 + rev;
            x = x / 10;
        }
        return x2 == sum;
    }

    public static void main(String ar[]) {
        Java21 s = new Java21();
        if (s.isPalindrome(320023)) {
            System.out.println("It's Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}

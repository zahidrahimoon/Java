public class Java25 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;

        while (c < 200) {
            c = a + b;
            if (c > 200) {
                break;
            }
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }

}

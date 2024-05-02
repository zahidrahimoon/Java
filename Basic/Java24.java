public class Java24 {
    public static void main(String[] args) {
        String str = "Zahid";
        char[] c = str.toCharArray();

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        System.out.println(str); 
        String reversed = new String(c);
        System.out.println(reversed); 
    }
}

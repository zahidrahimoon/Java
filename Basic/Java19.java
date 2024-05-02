public class Java19 {
    public static void main(String[] args) {
        String st = "Hzello this is my first string";
        String text1 = "Duet";
        text1 = text1 + " Karachi";
        System.out.println(text1.indexOf("i"));

        StringBuilder sb = new StringBuilder(st);

        sb.append(" in java");

        int size = st.length();
        char[] setChar = st.toCharArray();
        for (int i = 0; i < setChar.length; i++) {
            System.out.println(setChar[i]);
        }
        System.out.println("Actual Text:	" + st);
        System.out.println("Actual Text Upper Case:	" + st.toUpperCase());
        System.out.println("Actual Text lower Case:	" + st.toLowerCase());

        System.out.println("Total length of Characters of st:	" + size);
        System.out.println("First Character of st:	" + st.charAt(0));
        System.out.println("Last Character of st:	" + st.charAt(size - 1));
        System.out.println("Middle Character of st:	" + st.charAt((size / 2) + 1));
        System.out.println("Index of H Character:	" + st.indexOf("z"));
        System.out.println(st.substring(6, 10));

    }
}
import java.util.Scanner;

public class Java23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr ={
            {1, 4, 5, 3, 9},
            {4, 3, 9, 5, 2},
            {2, 1, 8, 6, 6},
            {6, 2, 6, 6, 13},
            {5, 4, 4, 2, 14}
        };
        for (int i = 0; i < arr.length; i++) {
            int highest1 = 0;
            int highest2 = 0;

            for(int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > highest1) {
                    highest2 = highest1;
                    highest1 = arr[i][j];
                }
                else if (arr[i][j] > highest2) {
                    highest2 = arr[i][j];
                }
            }
            int total = highest2 + highest1;
            System.out.println("Total marks obtained for student in roll number " + i + ": " + total);
        }
    }
}

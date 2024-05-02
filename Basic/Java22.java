public class Java22 {
    public static void main(String[] args) {
        float[] A = { 24, 14, 12, 74, 58, 74, 98, 84, 15, 24 };
        float[] B = { 87, 11, 10, 81, 67, 94, 74, 82, 15, 87 };
        float[] C = new float[10];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                C[i] = A[i] + (B[i] / 100.0f);
            } else {
                C[i] = B[i] + (A[i] / 100.0f);
            }
        }
        System.out.println("3rd Array");
        for (float num : C) {
            System.out.println(num);
        }
    }
}

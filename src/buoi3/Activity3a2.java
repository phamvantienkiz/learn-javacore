package buoi3;

public class Activity3a2 {
    public static void main(String[] args) {
        int arrayA[] = {20, 20, 30, 40, 50, 50, 50};
        int n = arrayA.length;
        for (int i = 0; i < n; i++) {
            if (arrayA[i] == arrayA[i + 1]) {
                for (int k = i; k < n - 1; k++) {
                    arrayA[k] = arrayA[k + 1];
                }
                n = n - 1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arrayA[i]);
        }
    }
}

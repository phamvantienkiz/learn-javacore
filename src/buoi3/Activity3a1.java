package buoi3;

public class Activity3a1 {
    public static void main(String[] args) {
        int arrayA[] = {1, 2, 3, 4};
        int arrayB[] = {2, 5, 7, 8};
        int n = arrayA.length + arrayB.length;
        int c[] = new int[n];
        int x = 0;
        // noi 2 mang
        for (int i = 0; i < n; i++) {
            if (i < arrayA.length) {
                c[i] = arrayA[i];
            } else {
                c[i] = arrayB[x];
                x++;
                //System.out.println(c[i]);
            }
        }
        //sap xep lai mang
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i] > c[j]) {
                    int t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        for (int element : c) {
            System.out.println(element);
        }
    }
}


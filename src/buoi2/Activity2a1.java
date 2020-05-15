package buoi2;

public class Activity2a1 {
    public static void main(String[] args) {
        /*System.out.println("Divided 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Divided 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Divided 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }*/

        String chia3 = "";
        String chia5 = "";
        String chia35 = "";

        for (int i =1; i<=100; i++) {
            if (i % 3 == 0) {
                chia3 = chia3 + " " +i;
            }
            if (i % 5 == 0) {
                chia5 = chia5 + " " +i;
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                chia35 = chia35 + " " +i;
            }
        }
        System.out.println("Divided 3: " + chia3);
        System.out.println("divided 5: " + chia5);
        System.out.println("Divided 3 & 5 : " + chia35);
    }
}
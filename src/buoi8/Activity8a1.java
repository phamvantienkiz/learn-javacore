package buoi8;

public class Activity8a1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Does not exist the fifth element in the array");
        }
        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        }catch (ArithmeticException e){
            System.out.println("error of division operations ");
        }
        try {
            String obj = null;
            System.out.println(obj.length());
        }catch (NullPointerException e){
            System.out.println("error, have no value ");
        }

        System.out.println("Finished!");


    }
}

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Moi nhap vao ten cua ban: ");
        String name= scanner.nextLine();
        System.out.println("nhap vao tuoi cua ban: ");
        int age = scanner.nextInt();
        //or use age = age +10;
        System.out.println("ten vua nhap vao la: "+ name +", tuoi cua ban sau 10 nam la: "+ (age +10));

    }
}


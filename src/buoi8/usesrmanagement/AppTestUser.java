package buoi8.usesrmanagement;

import java.util.Scanner;

public class AppTestUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tong so User ");
        int totalUser = 5;//scanner.nextInt();
        User[] users = new User[totalUser];
        scanner.nextLine();

        users[0] = new User(01126, "pvtien", "pvtien", "Van Tien", "vantien0@gmail.com" );
        users[1] = new User(15427, "vtienp", "vtienp", "Pham Tien", "vtien1@gmail.com");
        users[2] = new User(26489, "tienvp", "tienvp", "Tienvp", "vtien2@gmail.com");
        users[3] = new User(35478, "vtienn", "vtienn", "Tienn", "vtien3@gmail.com");
        users[4] = new User(46781, "ptienn", "ptienn", "pTienn", "vtien4@gmail.com");

        UserManagement userManagement = new UserManagement(users);
    }
}

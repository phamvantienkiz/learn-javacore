package buoi5bt;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tong so Sach: ");
        int n = scanner.nextInt();
        System.out.println();
        Book[] books = new Book[n];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Cuon sach " + (i+1) + " Ten: ");
            String name = scanner.nextLine();
            System.out.println("  -  Tac Gia: ");
            String author = scanner.nextLine();
            System.out.println(" ! Gia ban: ");
            long price = scanner.nextLong();
            System.out.println(" -> Tong so ban da ban duoc: ");
            long totalSold = scanner.nextLong();
            System.out.println();
            scanner.nextLine();
            books[i] = new Book(name, author, price ,totalSold);
        }

        BookManagement bookManagement = new BookManagement(books);

        for (int i = 0; i < n; i++) {
            System.out.println("cuon sach " + (i+1) + " Ten: " + books[i].getName() + " - Tac gia: " + books[i].getAuthor());
            System.out.println("    --    Gia ban: " + books[i].getPrice() + " --> Tong so da ban duoc: " + books[i].getTotalSold());
        }
        System.out.println(" Tong so cuon sach thuoc top Best Seller : " + bookManagement.demBestSeller());
        System.out.println(" Quyen sach ban chay nhat la: ");
        Book nameMax = bookManagement.topBestSeller();
        System.out.println("  - Ten: " + nameMax.getName());
        Book authorMax = bookManagement.topBestSeller();
        System.out.println("  - Tac gia: " + authorMax.getAuthor());
        Book priceMax = bookManagement.topBestSeller();
        System.out.println("  - Gia: " + priceMax.getPrice());
        Book totalSoldMax = bookManagement.topBestSeller();
        System.out.println("  - Tong so da ban: " + totalSoldMax.getTotalSold());
    }
}

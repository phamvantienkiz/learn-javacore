package buoi4;

import java.util.Scanner;

public class TextRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        int width = scanner.nextInt();
        System.out.println("Height: ");
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Chu vi la: " + rectangle.chuvi());
        System.out.println("Dien tich la: " + rectangle.dientich());
        rectangle.printsize();
        rectangle.checksquare();

        /*//khoi tao
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        Rectangle chieurong = new Rectangle();
        chieurong.setWidth(scanner.nextInt());
        System.out.print("Height: ");
        Rectangle chieucao = new Rectangle();
        chieucao.setHeight(scanner.nextInt());

        //tinh chu vi
        System.out.print("Chu vi: ");
        int p = (chieurong.getWidth() + chieucao.getHeight()) * 2;
        System.out.println(p);

        //tinh dien tich
        System.out.print("Dien tich: ");
        int s = chieurong.getWidth() * chieucao.getHeight();
        System.out.println(s);

        //in ra width, Height
        System.out.println("Width = " + chieurong.getWidth());
        System.out.println("Height = " + chieucao.getHeight());

        //kiem tra hinh vuong
        if (chieurong.getWidth() == chieucao.getHeight()) {
            System.out.println("Day la hinh chu nhat");
        } else {
            System.out.println("Day khong phai la hinh chu nhat");
        }*/

    }
}

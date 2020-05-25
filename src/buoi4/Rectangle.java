package buoi4;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int chuvi() {
        int chuvi = (width + height) * 2 ;
        return chuvi;
    }

    public int dientich() {
        int dientich = width*height;
        return dientich;
    }

    public void printsize() {
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
    }

    public void checksquare() {
        if (width == height) {
            System.out.println("Day la hinh vuong");
        } else {
            System.out.println("Day khong phai la hinh vuong");
        }
    }
}

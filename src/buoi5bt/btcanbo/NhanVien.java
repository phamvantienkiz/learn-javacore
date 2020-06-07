package buoi5bt.btcanbo;

public class NhanVien extends Canbo {

    private String congviec;

    public NhanVien(String name, int age, String gender, String address, String congviec) {
        super(name, age, gender, address);
        this.congviec = congviec;
    }

    public NhanVien() {

    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
}

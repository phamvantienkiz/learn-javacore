package buoi5bt.btcanbo;

public class KySu extends Canbo {

    private String nganhdaotao;

    public KySu(String name, int age, String gender, String address, String nganhdaotao) {
        super(name, age, gender, address);
        this.nganhdaotao = nganhdaotao;
    }

    public KySu() {

    }

    public String getNganhdaotao() {
        return nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }
}

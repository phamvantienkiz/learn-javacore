package buoi5bt.btcanbo;

public class ManagementCanbo {

    private int totalCongnhan;
    private CongNhan[] congNhans;
    private int totalKysu;
    private KySu[] kySus;

    public ManagementCanbo(CongNhan[] congNhans) {
        this.congNhans = congNhans;
        this.totalCongnhan = this.congNhans.length;
    }
    public ManagementCanbo(KySu[] kySus) {
        this.kySus = kySus;
        this.totalKysu = this.kySus.length;
    }

    public int getTotalCongnhan() {
        return totalCongnhan;
    }

    public void setTotalCongnhan(int totalCongnhan) {
        this.totalCongnhan = totalCongnhan;
    }

    public CongNhan[] getCongNhans() {
        return congNhans;
    }

    public void setCongNhans(CongNhan[] congNhans) {
        this.congNhans = congNhans;
    }

    public int getTotalKysu() {
        return totalKysu;
    }

    public void setTotalKysu(int totalKysu) {
        this.totalKysu = totalKysu;
    }

    public KySu[] getKySus() {
        return kySus;
    }

    public void setKySus(KySu[] kySus) {
        this.kySus = kySus;
    }

    public void findKySu(String nganhdaotao) {
        for (int i = 0; i < totalKysu; i++) {
            if (kySus[i].getNganhdaotao() == nganhdaotao) {
                System.out.println(kySus[i].getName()+"  "+kySus[i].getAge()+"  "+kySus[i].getGender()+"  "+kySus[i].getAddress());
            }
        }
    }

    public void findCongNhan(int bac) {
        for (int i = 0; i < totalCongnhan; i++) {
            if (congNhans[i].getBac() == bac) {
                System.out.println(congNhans[i].getName()+"  "+congNhans[i].getAge()+"  "+congNhans[i].getGender()+"  "+congNhans[i].getAddress());
            }
        }
    }

}

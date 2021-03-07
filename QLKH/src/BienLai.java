public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;


    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;

    }

    public int getTinhTien() {
        return ((chiSoMoi-chiSoCu)*750);
    }


    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "khachHang=" + khachHang +
                ", chiSoCu=" + chiSoCu +
                ", chiSoMoi=" + chiSoMoi +
                ", so tien phai tra :" + getTinhTien() +
                '}';
    }
}

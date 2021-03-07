public class KhachSan {
    private Nguoi nguoi;
    private int soNgay;
    private String loaiPhong;
    private int giaPhong;

    public KhachSan() {
    }

    public KhachSan(Nguoi nguoi, int soNgay, String loaiPhong, int giaPhong) {
        this.nguoi = nguoi;
        this.soNgay = soNgay;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "nguoi=" + nguoi +
                ", soNgay=" + soNgay +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", giaPhong=" + giaPhong +
                '}';
    }
}

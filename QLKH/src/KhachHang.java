public class KhachHang {
    private String ten;
    private String soNha;
    private String maCongTo;

    public KhachHang() {
    }

    public KhachHang(String ten, String soNha, String maCongTo) {
        this.ten = ten;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ten='" + ten + '\'' +
                ", soNha='" + soNha + '\'' +
                ", maCongTo='" + maCongTo + '\'' +
                '}';
    }
}

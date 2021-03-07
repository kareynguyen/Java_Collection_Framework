public class Nguoi extends HoDan {
    private String ten;
    private int tuoi;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String ten, int ngaySinh, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", ngaySinh=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                "}" +
                "thuoc ho dan co so nha: " + getSoNha();
    }
}

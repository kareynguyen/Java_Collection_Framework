public class Nguoi {
    private String ten;
    private int ngaySinh;
    private int id;

    public Nguoi() {
    }

    public Nguoi(String ten, int ngaySinh, int id) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", id=" + id +
                '}';
    }
}

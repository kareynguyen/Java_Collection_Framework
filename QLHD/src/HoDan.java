import java.util.ArrayList;

public class HoDan {
    private int soNguoi;
    private int soNha;
    ArrayList<Nguoi> listNguoi = new ArrayList<>();

    public ArrayList<Nguoi> getListNguoi() {
        return listNguoi;
    }

    public void setListNguoi(ArrayList<Nguoi> listNguoi) {
        this.listNguoi = listNguoi;
    }

    public HoDan() {
    }
   public void add(Nguoi nguoi){
        listNguoi.add(nguoi);
   }
    public HoDan(int soNguoi, int soNha) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

//    public Nguoi getNguoi() {
//        return nguoi;
//    }
//
//    public void setNguoi(Nguoi nguoi) {
//        this.nguoi = nguoi;
//    }


    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "hoDan{" +
//                "nguoi=" + nguoi +
                ", soNguoi=" + soNguoi +
                ", soNha=" + soNha +
                '}';
    }
}

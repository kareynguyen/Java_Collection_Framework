import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KhuPho {
    List<HoDan> danhSach = new ArrayList<>();

    void themThongTinHoDan(HoDan hoDan) {
        danhSach.add(hoDan);
    }

    void themThongTinNguoi(Nguoi nguoi) {
        danhSach.add(nguoi);
    }

    void hienThiHoDan() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i).toString());
        }
    }

    void timKiemNguoi() {
        for (HoDan danhSach : danhSach) {
            for (Nguoi nguoi : danhSach.getListNguoi()) {
                if (nguoi.getTuoi() > 80) {
                    System.out.println(nguoi.toString() +"thuoc ho  " + danhSach.getSoNha());
                }
            }
        }
    }
}


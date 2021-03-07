import java.util.ArrayList;

public class QuanLi {
    ArrayList<BienLai> list = new ArrayList<>();

    void them(BienLai bienLai){
        list.add(bienLai);
    }

    void hienThi(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    void timKiem(String soNhaCanTim){
        for (int i = 0; i < list.size(); i++) {
            if (soNhaCanTim.equals(list.get(i).getKhachHang().getSoNha())){
                System.out.println(list.get(i).getKhachHang());
                System.out.println(list.get(i).getTinhTien());
            }
        }
    }


}

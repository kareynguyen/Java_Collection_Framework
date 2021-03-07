import java.util.ArrayList;

public class QuanLy {
    ArrayList<KhachSan> list = new ArrayList();

    void nhap(KhachSan khachSan){
        list.add(khachSan);
    }
    void hienThi(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    void xoa(KhachSan khachSan){
        for (int i = 0; i < list.size(); i++) {
            if (khachSan == list.get(i)){
                list.remove(i);
            }
        }
    }
    void timKiem(KhachSan khachSan){
        for (int i = 0; i < list.size(); i++) {
            if (){

            }
        }
    }
}

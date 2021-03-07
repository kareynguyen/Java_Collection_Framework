
import java.util.IllegalFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLi quanLi = new QuanLi();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Them bien lai moi: ");
            System.out.println("2. Hien thi thong tin bien lai ");
            System.out.println("3. Tim kiem thong tin khach hang ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap ten: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhap so nha: ");
                    String soNha = sc.nextLine();
                    System.out.println("Nhap ma cong to: ");
                    String maCongTo = sc.nextLine();
                    KhachHang khachHang = new KhachHang(ten, soNha, maCongTo);
                    try{
                        System.out.println("Chi so cu: ");
                        int chiSoCu = sc.nextInt();
                        System.out.println("Chi so moi: ");
                        int chiSoMoi = sc.nextInt();

                        BienLai bienLai = new BienLai(khachHang, chiSoCu, chiSoMoi);
                        quanLi.them(bienLai);
                        break;
                    }catch (IllegalFormatException e){
                        System.out.println("Hay nhap so!");
                    }
                case 2:
                    quanLi.hienThi();
                    break;
                case 3:
                    System.out.println("Nhap so nha can tim: ");
                    sc.nextLine();
                    String soNhaCanTim = sc.nextLine();
                    quanLi.timKiem(soNhaCanTim);
                case 4:
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Xin moi nhap lai");
                }
            }
        } while (choice != 0);

    }
}

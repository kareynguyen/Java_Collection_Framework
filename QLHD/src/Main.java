import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        KhuPho khuPho = new KhuPho();
//        int choice = 0;
//        do {
//            System.out.println("*******************************");
//            System.out.println("1. Them ho dan: ");
//            System.out.println("2. Them nguoi trong moi ho dan: ");
//            System.out.println("3. Hien thi ho dan: ");
//            System.out.println("4. Tim kiem ho dan co nguoi duoc mung thuong tho 80 tuoi: ");
//            System.out.println("*******************************");
//            try{
//                choice = sc.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println("Hay nhap 1 so!");
//            }
//            switch (choice){
//                case 1:
//                    System.out.println("Nhap so nha: ");
//                    int soNha = sc.nextInt();
//                    System.out.println("Nhap so nguoi trong nha: ");
//                    int soNguoi = sc.nextInt();
//                    HoDan hoDan = new HoDan(soNguoi, soNha);
//                    khuPho.themThongTinHoDan(hoDan);
//                    break;
//                case 2:
//                    System.out.println("Nhap ten: ");
//                    sc.nextLine();
//                    String ten = sc.nextLine();
//                    System.out.println("Nhap tuoi: ");
//                    int tuoi = sc.nextInt();
//                    System.out.println("Nhap nghe nghiep: ");
//                    String ngheNghiep = sc.nextLine();
//                    Nguoi nguoi = new Nguoi(ten, tuoi, ngheNghiep);
//                    khuPho.themThongTinNguoi(nguoi);
//                    HoDan hoDan1= new HoDan();
//                    hoDan1.add(nguoi);
//                    break;
//                case 3:
//                    khuPho.hienThiHoDan();
//                    break;
//                case 4:
//                    khuPho.timKiemNguoi(80);
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:{
//                    System.out.println("Xin moi nhap lai lua chon: ");
//                }
//            }
//
//        }while (choice !=0);
//
//    }
//}
//
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi("thanh", 10, "pho ho");
        Nguoi nguoi2 = new Nguoi("sdas", 110, "pho ho");
        Nguoi nguoi3 = new Nguoi("thansadsah", 90, "pho ho");
        HoDan hoDan1 = new HoDan(2, 3);
        hoDan1.add(nguoi1);
        hoDan1.add(nguoi2);
        HoDan hoDan2 = new HoDan(1, 35);
        hoDan2.add(nguoi3);
        KhuPho khuPho = new KhuPho();
        khuPho.themThongTinHoDan(hoDan1);
        khuPho.themThongTinHoDan(hoDan2);
        KhuPho quanLy = new KhuPho();
        quanLy.timKiemNguoi();

    }
}
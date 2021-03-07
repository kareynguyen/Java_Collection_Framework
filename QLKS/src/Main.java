import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Nhap khach hang moi: ");
            System.out.println("2. Hien thi khach hang: ");
            System.out.println("3. Xoa khach hang theo CMND: ");
            System.out.println("4. Tim khach hang theo CMND: ");
            choice = sc.nextInt();


        }while (choice!=0);
    }
}

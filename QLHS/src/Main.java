import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int choice;
        do {

            System.out.println("****************************************");
            System.out.println("1. Add student: ");
            System.out.println("2. Edit student: ");
            System.out.println("3. Delete student: ");
            System.out.println("4. Show list student: ");
            System.out.println("5. Search by id: ");
            System.out.println("Enter your choice: ");
            System.out.println("****************************************");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter new id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter new name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter new age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter new class name: ");
                    sc.nextLine();
                    String className = sc.nextLine();

                    Student student1 = new Student(id, name, age, className);
                    studentManager.add(student1);
                    break;
                case 2:
                    System.out.println("Edit by id: ");
                    int a = sc.nextInt();
                    System.out.println("Enter new id: ");
                    int editId = sc.nextInt();
                    System.out.println("Enter new name: ");
                    sc.nextLine();
                    String editName = sc.nextLine();
                    System.out.println("Enter new age: ");
                    int editAge = sc.nextInt();
                    System.out.println("Enter new class name: ");
                    sc.nextLine();
                    String editClassName = sc.nextLine();

                    Student editStudent = new Student(editId, editName, editAge, editClassName);
                    studentManager.edit(a, editStudent);
                    break;
                case 3:
                    System.out.println("Delete by ID");
                    int b = sc.nextInt();
                    studentManager.delete(b);
                    break;
                case 4:
                    studentManager.show();
                    break;
                case 5:
                    System.out.println("Enter ID: ");
                    int c = sc.nextInt();
                    sc.nextLine();
                    studentManager.search(c);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Please enter your choice again!");
                }
            }
        } while (choice != 0);
    }
}

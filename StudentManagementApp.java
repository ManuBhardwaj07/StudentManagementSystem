import java.util.*;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Search 6.Topper 7.Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Enter number only!");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Course: ");
                    String course = sc.next();
                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    service.addStudent(id, name, age, course, marks);
                    break;

                case 2:
                    service.viewAll();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Name: ");
                    String n = sc.next();
                    System.out.print("Age: ");
                    int a = sc.nextInt();
                    System.out.print("Course: ");
                    String c = sc.next();
                    System.out.print("Marks: ");
                    double m = sc.nextDouble();

                    service.updateStudent(uid, n, a, c, m);
                    break;

                case 4:
                    System.out.print("ID: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("ID: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 6:
                    service.showTopper();
                    break;

                case 7:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
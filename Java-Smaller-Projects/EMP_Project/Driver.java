package EMP_Project;

import java.util.Scanner;

public class Driver {

    private static String username = null;
    private static String password = null;
    private static Operations ops = new Operations();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===");

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    if (login()) {
                        menu();
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void register() {
        if (username != null) {
            System.out.println("Already registered! Please login.");
            return;
        }
        System.out.println("\n=== Register ===");
        System.out.print("Create Username: ");
        username = sc.nextLine();
        System.out.print("Create Password: ");
        password = sc.nextLine();
        System.out.println("✅ Registration successful! Please login.");
    }

    private static boolean login() {
        if (username == null) {
            System.out.println("Please register first!");
            return false;
        }

        System.out.println("\n=== Login ===");
        System.out.print("Enter Username: ");
        String un = sc.nextLine();
        System.out.print("Enter Password: ");
        String pw = sc.nextLine();

        if (un.equals(username) && pw.equals(password)) {
            System.out.println("✅ Login Successful!");
            return true;
        } else {
            System.out.println("❌ Invalid credentials!");
            return false;
        }
    }

    private static void menu() {
        while (true) {
            System.out.println("\n=== Employee Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: ops.addEmp(); break;
                case 2: ops.displayEmps(); break;
                case 3: ops.removeEmp(); break;
                case 4: ops.updateEmp(); break;
                case 5:
                    System.out.println("Logged out successfully!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
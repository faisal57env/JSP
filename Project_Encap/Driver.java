package Project_Encap;

import java.util.Scanner;

public class Driver {

    // Array to store multiple users (max 10 users)
    private static final int MAX_USERS = 10;
    private static Roles[] users = new Roles[MAX_USERS];
    private static int userCount = 0; // Keeps track of how many users are registered

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show Number of Registered Users");
            System.out.println("4. Display All Registered Users");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    registerUser(sc);
                    break;

                case 2:
                    if (userCount == 0) {
                        System.out.println("No users registered yet! Please register first.");
                    } else {
                        loginUser(sc);
                    }
                    break;

                case 3:
                    System.out.println("\nTotal Registered Users: " + userCount);
                    break;

                case 4:
                    displayAllUsers();
                    break;

                case 5:
                    System.out.println("Thank you for using the application!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void registerUser(Scanner sc) {
        if (userCount >= MAX_USERS) {
            System.out.println("Maximum user limit reached! Cannot register more users.");
            return;
        }

        System.out.println("\n--- Registration ---");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Check if ID already exists
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                System.out.println("Error: User with this ID already exists!");
                return;
            }
        }

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        long phno = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Role (user/admin): ");
        String roleInput = sc.nextLine().trim().toLowerCase();

        String role = "user"; // default
        if (roleInput.equals("admin") || roleInput.equals("a")) {
            role = "admin";
        } else if (!roleInput.equals("user") && !roleInput.equals("u")) {
            System.out.println("Invalid role! Defaulting to 'user'.");
        }

        users[userCount] = new Roles(id, pwd, name, phno, role);
        userCount++;

        System.out.println("Registration successful! You are now registered as User #" + userCount);
    }

    private static void loginUser(Scanner sc) {
        System.out.println("\n--- Login ---");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        // Search for user
        Roles currentUser = null;
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id && users[i].getPwd().equals(pwd)) {
                currentUser = users[i];
                break;
            }
        }

        if (currentUser != null) {
            System.out.println("Login Successful! Welcome, " + currentUser.getName());

            int subChoice;
            do {
                System.out.println("\n--- Logged In Menu ---");
                System.out.println("1. Display Details");
                System.out.println("2. Update Phone Number");
                System.out.println("3. Update Password");
                System.out.println("4. Logout");
                System.out.print("Enter choice: ");
                subChoice = sc.nextInt();
                sc.nextLine();

                switch (subChoice) {
                    case 1:
                        currentUser.displayDetails();
                        break;

                    case 2:
                        System.out.print("Enter new Phone Number: ");
                        long newPhno = sc.nextLong();
                        sc.nextLine();
                        currentUser.setPhno(newPhno);
                        System.out.println("Phone number updated successfully!");
                        break;

                    case 3:
                        System.out.print("Enter new Password: ");
                        String newPwd = sc.nextLine();
                        currentUser.setPwd(newPwd);
                        System.out.println("Password updated successfully!");
                        break;

                    case 4:
                        System.out.println("Logged out successfully.");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } while (subChoice != 4);
        } else {
            System.out.println("Login Failed! Incorrect ID or Password.");
        }
    }

    // New method to display all registered users
    private static void displayAllUsers() {
        if (userCount == 0) {
            System.out.println("\nNo users registered yet!");
            return;
        }

        System.out.println("\n=== All Registered Users ===");
        for (int i = 0; i < userCount; i++) {
            System.out.println("\n--- User #" + (i + 1) + " ---");
            System.out.println("ID       : " + users[i].getId());
            System.out.println("Name     : " + users[i].getName());
            System.out.println("Phone No : " + users[i].getPhno());
            System.out.println("Role     : " + users[i].getRole());
        }
        System.out.println("\nTotal Users Displayed: " + userCount);
    }
}
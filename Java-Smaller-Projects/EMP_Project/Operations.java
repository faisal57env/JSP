package EMP_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {

    private ArrayList<Emp> empList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEmp() {
        System.out.println("\n=== Add New Employee ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Phone Number: ");
        long phno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Emp emp = new Emp(name, eid, phno, email, sal, dept);
        empList.add(emp);
        System.out.println("✅ Employee added successfully!");
    }

    public void displayEmps() {
        System.out.println("\n=== All Employees ===");
        if (empList.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }
        for (Emp e : empList) {
            System.out.println(e);
        }
    }

    public void removeEmp() {
        System.out.println("\n=== Remove Employee ===");
        System.out.print("Enter Employee ID to remove: ");
        int eid = sc.nextInt();
        sc.nextLine();

        boolean removed = empList.removeIf(e -> e.getEid() == eid);
        if (removed) {
            System.out.println("✅ Employee removed successfully!");
        } else {
            System.out.println("❌ Employee with ID " + eid + " not found!");
        }
    }

    public void updateEmp() {
        System.out.println("\n=== Update Employee ===");
        System.out.print("Enter Employee ID to update: ");
        int eid = sc.nextInt();
        sc.nextLine();

        for (Emp e : empList) {
            if (e.getEid() == eid) {
                System.out.print("Enter New Name: ");
                e.setName(sc.nextLine());
                System.out.print("Enter New Phone: ");
                e.setPhno(sc.nextLong());
                sc.nextLine();
                System.out.print("Enter New Email: ");
                e.setEmail(sc.nextLine());
                System.out.print("Enter New Salary: ");
                e.setSal(sc.nextDouble());
                sc.nextLine();
                System.out.print("Enter New Department: ");
                e.setDept(sc.nextLine());

                System.out.println("✅ Employee updated successfully!");
                return;
            }
        }
        System.out.println("❌ Employee with ID " + eid + " not found!");
    }
} 
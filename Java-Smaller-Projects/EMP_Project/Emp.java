package EMP_Project;

public class Emp {

    private String name;
    private int eid;
    private long phno;
    private String email;
    private double sal;
    private String dept;

    public Emp(String name, int eid, long phno, String email, double sal, String dept) {
        this.name = name;
        this.eid = eid;
        this.phno = phno;
        this.email = email;
        this.sal = sal;
        this.dept = dept;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEid() { return eid; }
    public void setEid(int eid) { this.eid = eid; }

    public long getPhno() { return phno; }
    public void setPhno(long phno) { this.phno = phno; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getSal() { return sal; }
    public void setSal(double sal) { this.sal = sal; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override
    public String toString() {
        return "Employee [ID=" + eid + ", Name=" + name + ", Phone=" + phno 
               + ", Email=" + email + ", Salary=" + sal + ", Dept=" + dept + "]";
    }
}
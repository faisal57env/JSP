package Project_Encap;

public class Roles {

    private int id;
    private String pwd;
    private String name;
    private long phno;
    private String role;  

   
    public Roles(int id, String pwd, String name, long phno, String role) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phno = phno;
        this.role = role;
    }

   
    public int getId() { return id; }
    public String getPwd() { return pwd; }
    public String getName() { return name; }
    public long getPhno() { return phno; }
    public String getRole() { return role; }

   
    public void setPhno(long phno) { this.phno = phno; }
    public void setPwd(String pwd) { this.pwd = pwd; }

   
    public void displayDetails() {
        System.out.println("\n=== User Details ===");
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Phone No : " + phno);
        System.out.println("Role     : " + role);
    }
}
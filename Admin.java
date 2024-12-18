import java.time.LocalDate;

public class Admin extends User {
    protected String name;
    private LocalDate dob;

    public Admin() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public Admin(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type : admin");
    }

    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("Name: " + getName());
            System.out.println("Date of Birth: " + getDob());
            System.out.println("User type: admin.");
            System.out.println("Today's Date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + getName());
        }
    }
}

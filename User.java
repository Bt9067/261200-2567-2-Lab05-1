import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, LocalDate dob) {
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
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}

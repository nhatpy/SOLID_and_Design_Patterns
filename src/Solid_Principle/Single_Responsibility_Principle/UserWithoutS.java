package Solid_Principle.Single_Responsibility_Principle;

public class UserWithoutS {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserWithoutS(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser() {
        // Logic to save user
        System.out.println("User saved: " + name + ", " + email);
    }

    public void sendEmail() {
        // Logic to send email
        System.out.println("Email sent to: " + email);
    }
}

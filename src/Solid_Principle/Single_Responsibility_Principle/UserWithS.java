package Solid_Principle.Single_Responsibility_Principle;

public class UserWithS {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserWithS(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class UserPersistence {
    private UserWithS user;

    public UserPersistence(UserWithS user) {
        this.user = user;
    }

    public void saveUser() {
        // Logic to save user
        System.out.println("User saved: " + user.getName() + ", " + user.getEmail());
    }
}

class EmailService {
    private UserWithS user;

    public EmailService(UserWithS user) {
        this.user = user;
    }

    public void sendEmail() {
        // Logic to send email
        System.out.println("Email sent to: " + user.getEmail());
    }
}
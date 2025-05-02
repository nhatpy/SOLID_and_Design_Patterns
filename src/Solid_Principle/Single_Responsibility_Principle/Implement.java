package Solid_Principle.Single_Responsibility_Principle;

public class Implement {
    public static void main(String[] args) {

        // This class doesn't follow the principle of S principle of Single
        UserWithoutS userWithoutS = new UserWithoutS("nhatpy", "dlnhatpy0301@gmail.com");
        userWithoutS.saveUser();
        userWithoutS.sendEmail();

        // This class follows the principle of S principle of Single Responsibility
        UserWithS userWithS = new UserWithS("nhatpy", "dlnhatpy0301@gmail.com");
        UserPersistence userPersistence = new UserPersistence(userWithS);
        EmailService emailService = new EmailService(userWithS);
        userPersistence.saveUser();
        emailService.sendEmail();
    }
}

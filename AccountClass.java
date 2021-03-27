package chapterFour;

public class AccountClass {
    private String firstName;
    private String lastName;
    private int accountNumber;

    public AccountClass(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    //    public static void customerAccountInformation(phoneNumber, char emailAddress, boolean sex) {
//
//    }
}
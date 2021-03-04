package chapterFour;

/*(Credit Limit Calculator) Develop a Java application that determines whether any of several
        department-store customers has exceeded the credit limit on a charge account. For each customer,
        the following facts are available:
        a) account number
        b) balance at the beginning of the month
        c) total of all items charged by the customer this month
        d) total of all credits applied to the customer’s account this month
        e) allowed credit limit.
        The program should input all these facts as integers, calculate the new balance (= beginning balance
        + charges – credits), display the new balance and determine whether the new balance exceeds the
        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
        the message "Credit limit exceeded"*/





import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Customer's name: ");
        String name = input.nextLine();

        System.out.println("Enter Customer's Account Number: ");
        int accountNumber = input.nextInt();

        System.out.println("Enter Customer's balance");
        int balance = input.nextInt();

        System.out.println("Enter Charges");
        int charges = input.nextInt();

        System.out.println("Credits");
        int credits = input.nextInt();


        int newBalance = balance + (charges - credits);
        System.out.println("New Balance is : " + newBalance);

        if (newBalance > credits )
            System.out.println("within limit");
        else if
        (credits > newBalance)
            System.out.println("Credit limit exceeded");





    }

}

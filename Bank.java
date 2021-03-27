package chapterFour;

import java.util.ArrayList;

public class Bank {
    private String accountInfo;
    private int accountID;
    ArrayList<AccountClass> accounts = new ArrayList<>();

    public Bank(String bank) {

    }

    public void createAccount(String firstName, String lastName, int accountNumber) {
        AccountClass accountInfo = new AccountClass(firstName, lastName, accountNumber);
//        accountID = accountNumber;

//        this.accountInfo = firstName + lastName;
        accounts.add(accountInfo);
    }
    public int getAccountID(){
        return accountID;
    }
    public String getAccountInfo(){
        return accountInfo;
    }


    public void newAccount(AccountClass account1) {
        accounts.add(account1);
    }
    public int getAccountList(){
        return accounts.size();
    }

//    public void customerAccountInformation(String phoneNumber, char emailAddress, boolean sex) {
//        AccountClass.customerAccountInformation(phoneNumber, emailAddress, sex);
//
//    }

    public AccountClass findAccountByAccountNumber(int accountNumber) {
              for(AccountClass accountClass: accounts){
            if(accountClass.getAccountNumber()==accountNumber){
                return accountClass;
            }
        }
        return null;
    }
}
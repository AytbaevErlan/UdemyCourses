package UdemyOOP.ChallengeOOP;

import org.w3c.dom.ls.LSOutput;

public class Account {
   private  String accountNumber;
   private double accountBalance;
   private String customerName;
   private String email;
   private String phoneNumber;

   public Account(){
       this("56789", 500.0, "Default Name", "Default email",
               "default phone number");
       System.out.println("empty constructor called");
   }
    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
       this("9999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        accountBalance += depositAmount;
       System.out.println("Deposit of $" + depositAmount + " made. New Account Balance: $" + accountBalance);
   }

   public void withdrawFunds(double withdraawAmount){

       if (accountBalance - withdraawAmount < 0) {
           System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account");
       } else {
           accountBalance -= withdraawAmount;
           System.out.println("Withdraw of $" + withdraawAmount + " made. Remaining Balance: $" + accountBalance);
       }
   }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

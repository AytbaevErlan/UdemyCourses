package UdemyOOP.ChallengeOOP;

public class Main {
    public static void main(String[] args) {
//        Account ashleysAccount = new Account("12345", 1000.0,
//                "Ashley", "ashley@mail.com", "+12 123 123 123");

        Account ashleysAccount = new Account();

        System.out.println(ashleysAccount.getAccountNumber());
        System.out.println(ashleysAccount.getAccountBalance());

//        ashleysAccount.setAccountNumber("12345");
//        ashleysAccount.setAccountBalance(1000.0);
//        ashleysAccount.setEmail("erlan@gmail.com");
//        ashleysAccount.setCustomerName("Ashley William");
//        ashleysAccount.setPhoneNumber("+12 123 123 123");

        ashleysAccount.withdrawFunds(100.0);
        ashleysAccount.depositFunds(250.0);
        ashleysAccount.withdrawFunds(50.0);

        ashleysAccount.withdrawFunds(200.0);

        ashleysAccount.depositFunds(100.0);
        ashleysAccount.withdrawFunds(45.55);
        ashleysAccount.withdrawFunds(54.46);
        ashleysAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tims@mail.com", "+23 123 321 123");
        System.out.println("Account no: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());
    }
}

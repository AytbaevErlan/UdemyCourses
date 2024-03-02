package UdemyOOP.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1999", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_____________________________");

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/02/2012", "02/03/2024", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's pansion check - $" + joe.collectPay());
        System.out.println("_____________________________");


        HourlyEmployee mary = new HourlyEmployee("Mary", "10/10/1970", "10/02/2001", 15);

        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's hourlu pay = $" + mary.getDoublePay());
        System.out.println("_____________________________");
    }
}

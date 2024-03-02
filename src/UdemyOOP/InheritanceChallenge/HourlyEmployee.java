package UdemyOOP.InheritanceChallenge;

public class HourlyEmployee extends Employee{
    private double hourslyPayrate;

    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourslyPayrate) {
        super(name, birthDate, hireDate);
        this.hourslyPayrate = hourslyPayrate;
    }

    @Override
    public double collectPay() {
        return  40 * hourslyPayrate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }
}

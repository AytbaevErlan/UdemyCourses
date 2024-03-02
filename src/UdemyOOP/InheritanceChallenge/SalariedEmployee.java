package UdemyOOP.InheritanceChallenge;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    protected boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paychek = annualSalary / 26;
        double adjustPay = (isRetired) ? 0.9 * paychek : paychek;

        return (int) adjustPay;
    }
    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}

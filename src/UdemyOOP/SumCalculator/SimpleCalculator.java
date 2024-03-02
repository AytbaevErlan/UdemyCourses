package UdemyOOP.SumCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double addition = firstNumber + secondNumber;
        System.out.println(addition);
        return addition;
    }
    public double getSubstractionResult(){
        double substraction = firstNumber - secondNumber;
        return substraction;
    }
    public double getMultiplicationResult(){
        double multiplication = firstNumber * secondNumber;
        return multiplication;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        } else {
            double division = firstNumber / secondNumber;
           return division;
        }
    }
}
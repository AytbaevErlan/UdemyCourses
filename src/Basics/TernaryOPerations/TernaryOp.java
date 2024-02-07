package Basics.TernaryOPerations;

public class TernaryOp {
    public static void main(String[] args) {
        String makeOfCar = "Honda";
        boolean isDomestic = makeOfCar == "Honda" ? false : true;

        if(isDomestic){
            System.out.println("this car s domestic to our country");
        }

        String s = (isDomestic) ? "This car is not domestic"  : " This is car is domestic";
        System.out.println(s);
    }
}

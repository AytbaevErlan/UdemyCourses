package Basics;


public class Main {
    public static void main(String[] args) {
        int topScore = 80;

        if(topScore < 100){
            System.out.println("You got high score");
        }
        // && - AND operator
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less then 100");
        }
        // || - OR operator

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }


        int newValue = 50;
//        if (newValue = 50){
//            System.out.println("This an error!");
//        }
        if(newValue == 50){
            System.out.println("True!");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        } else if(isCar == false) {
            System.out.println("Correct!");
        }

        boolean isOne = false;
        if(!isOne){
            System.out.println("This is true if it is happened!");
        }
    }
}

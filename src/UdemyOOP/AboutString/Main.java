package UdemyOOP.AboutString;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));

    }
}

package UdemyOOP.ComputerFactory;

public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "dell", "140");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 X 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-2000", "Asus", 4, 6, "v2.44");

        PersonalComputer pc = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherBoard);

        pc.getComputerCase().pressPowerButton();
        pc.getMotherBoard().loadProgram("Windows OS");
        pc.getMonitor().drawPixelAt(10, 10, "red");
    }
}

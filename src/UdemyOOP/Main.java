package UdemyOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("RedRed");
        car.setConvertable(true);
//        car.color = "red";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("Blue");
        targa.setConvertable(false);
        targa.describeCar();

    }
}

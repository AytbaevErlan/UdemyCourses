package UdemyOOP;

public class Car {
    private String make = "Tesla";
    private String model = " Model x";
    private String color = "Red";
    private int doors = 4;
    private boolean convertable = true;

    public String getMake(){
        return make;
    }

    public void setMake(String make) {

        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "tesla", "porsche" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public void describeCar(){
        System.out.println(doors + " - doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertable ? "Convertable" : ""));
    }
}

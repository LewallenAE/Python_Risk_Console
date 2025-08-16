import static java.lang.System.out;

public class Car {

    // field variables

    // primitive number values are either set to 0 by default or 0.0
    // strings are automatically null if nothing
    // booleans are set to false by default

    private String make = "Dodge";
    private String model = "Charger";
    private String color = "Black";
    private int doors = 4;
    private boolean convertible = false;


    public void setMake(String make) {

        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla", "cadillac", "charger" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }
    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors() {
        return doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void describeCar() {

        out.println(doors + "-Door " +
                color + " " +
                make + " " +
                (convertible ? "Convertible" : ""));
    }
}

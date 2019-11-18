package ex2;

public class Vehicle {
    private String type;
    private String producer;
    private String model;
    private int year;
    private int distance;
    private String VIN;

    public Vehicle(String type, String producer, String model, int year, int distance, String VIN) {
        this.type = type;
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.VIN = VIN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return producer;
    }

    public void setBrand(String brand) {
        this.producer = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", distance=" + distance +
                ", VIN='" + VIN + '\'' +
                '}';
    }
}

package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public abstract class Vehicle {

    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "`Class : "+this.getClass().getName()+", model: "+this.model+", speed: "+this.maxSpeed+"`.";
    }
}

package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

import b_Zadania_Domowe.b_Dzien_2.Inspectionable;

public class Car extends Vehicle implements Inspectionable {

    private String type;

    public Car(int maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void createInspection() {
        System.out.println(type+" "+super.getModel()+" checked");
    }
}

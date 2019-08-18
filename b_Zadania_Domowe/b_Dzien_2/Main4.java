package b_Zadania_Domowe.b_Dzien_2;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Car;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Train;
import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.Vehicle;

public class Main4 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car(180, "Fiat", "Car");
        vehicles[1] = new Train(200, "EU07", 1435);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            if (vehicle instanceof Inspectionable) {
                ((Inspectionable) vehicle).createInspection();
            }


        }
    }
}

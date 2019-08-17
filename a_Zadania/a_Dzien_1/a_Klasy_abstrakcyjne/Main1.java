package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Main1 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car(180, "Fiat", "Car");
        vehicles[1] = new Train(200, "EU07", 1435);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

    }

}

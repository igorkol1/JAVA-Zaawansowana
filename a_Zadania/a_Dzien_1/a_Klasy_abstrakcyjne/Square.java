package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Square extends Shape {

    private double a;

    public Square(double a,String color) {
        this.a = a;
        super.setArea(calculateArea());
        super.setCircuit(calculateCircuit());
        super.setColor(color);
    }

    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    double calculateCircuit() {
        return 4*a;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku "+a+" - pole = "+super.getArea()+", obwód = "+super.getCircuit();
    }
}

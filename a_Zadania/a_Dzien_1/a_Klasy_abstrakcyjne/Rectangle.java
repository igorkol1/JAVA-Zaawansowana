package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        super.setArea(calculateArea());
        super.setCircuit(calculateCircuit());
        super.setColor(color);
    }

    @Override
    double calculateArea() {

        return a * b;
    }

    @Override
    double calculateCircuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach " + a + " i " + b + " - pole = " + super.getArea() + ", obwód =" + super.getCircuit();
    }

}

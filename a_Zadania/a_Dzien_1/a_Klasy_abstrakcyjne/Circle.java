package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public class Circle extends Shape {

    private double r;

    public Circle(double r,String color) {
        this.r = r;
        super.setArea(calculateArea());
        super.setCircuit(calculateCircuit());
        super.setColor(color);
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    double calculateCircuit() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Koło o promieniu "+r+"- pole = "+super.getArea()+", obwód = "+super.getCircuit();
    }
}

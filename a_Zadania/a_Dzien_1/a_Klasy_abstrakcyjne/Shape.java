package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne;

public abstract class Shape {

    private double area;
    private double circuit;
    private String color;

    abstract double calculateArea();
    abstract double calculateCircuit();

    public void setArea(double area) {
        this.area = area;
    }

    public void setCircuit(double circuit) {
        this.circuit = circuit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public double getCircuit() {
        return circuit;
    }

    public String getColor() {
        return color;
    }
}

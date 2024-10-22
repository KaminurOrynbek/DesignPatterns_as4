package Visitor;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Calculating Areas:");
        drawing.calculateAreas(areaCalculator);
    }
}

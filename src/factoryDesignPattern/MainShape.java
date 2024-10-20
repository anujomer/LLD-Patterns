package factoryDesignPattern;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        circle.draw();
        rectangle.draw();
    }
}

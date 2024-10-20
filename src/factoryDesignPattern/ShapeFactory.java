package factoryDesignPattern;

import java.awt.*;

public class ShapeFactory {

    Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Rectangle":
                return new RectangleShapeImpl();
            case "Circle":
                return new CircleShapeImpl();

            default:
                return null;

        }
    }
}

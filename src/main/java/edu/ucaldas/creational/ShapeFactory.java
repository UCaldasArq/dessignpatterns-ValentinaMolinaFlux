package edu.ucaldas.creational;

public class ShapeFactory {

    public Shape createShape(String type) {
        if ("Circle".equals(type)) {
            return new Circle();
        }
        if ("Square".equals(type)) {
            return new Square();
        }
        return null;
    }
}

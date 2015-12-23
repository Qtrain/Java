package DesignPatterns.Factory;

/**
 * Created by macbook on 11/10/15.
 */
public class FactoryClient {
    public static void main(String[] args) {


        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("cCIRCLE");

        shape1.draw();
    }
}

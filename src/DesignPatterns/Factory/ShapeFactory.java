package DesignPatterns.Factory;


/**
 * Created by macbook on 11/10/15.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("cCIRCLE")){
            return new CCircle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Rectangle();
        }
        return null;
    }
}

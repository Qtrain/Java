package DesignPatterns.Factory;

/**
 * Created by macbook on 11/10/15.
 */
public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside the square draw method");
    }
}

class CCircle implements Shape{
    @Override
    public void draw(){
        System.out.println("inside the circle draw method");
        }
    }



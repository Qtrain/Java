package DesignPatterns.Adapter;

/**
 * Created by macbook on 10/21/15.
 */
public class MallardDuck implements Duck {
    public void quack(){
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}

package DesignPatterns.Adapter;

/**
 * Created by macbook on 10/21/15.
 */
public class WildTurkey implements Turkey{
    public void gobble(){
        System.out.println("gobble");
    }
    public void fly(){
        System.out.println("yes turkey's can fly dammit");
    }
}

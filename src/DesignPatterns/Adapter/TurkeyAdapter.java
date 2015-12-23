package DesignPatterns.Adapter;

/**
 * Created by macbook on 10/21/15.
 */

/**
 * First implement the interface of the type your adapting to.  This is the interfact the client expects to see.
 */
//first implement the interface of the type your adapting to
//This is the interface your client expects to see
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    /**
     * get a reference to the object that we are adapting.  Here we do that through the constuctor
     */
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    /**
     * Now we implement all the methods in the interface; the quack()translation between classes is easy:
     * just call the gobble method.
     */
    public void quack(){
        turkey.gobble();
    }

    /**
     * Even though both interfaces have a fly() method, turkeys fly in short spurts so we make up for it
     * with a loop
     */
    public void fly(){
        for(int i=0; i<5; i++){
            turkey.fly();
        }
    }

}

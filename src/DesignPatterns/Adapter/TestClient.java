package DesignPatterns.Adapter;

/**
 * Created by macbook on 10/21/15.
 */
public class TestClient {
    public static void main(String[] args) {
        MallardDuck myDuck = new MallardDuck();
        WildTurkey myTurks = new WildTurkey();

        //wrap a duck in a turkey adapter so it looks like a duck
        Duck turkeyAdapter = new TurkeyAdapter(myTurks);

        System.out.println("The turkey says..");
        myTurks.gobble();
        myTurks.fly();

        //the part that tests it without an adapter
        System.out.println("The Duck says..");
        testDuck(myDuck);

        //testing with the adapter
        System.out.println("/n The turkey adapter says");
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}

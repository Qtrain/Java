package DesignPatterns.Singleton;

/**
 * Created by macbook on 11/10/15.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            System.out.println("filling");
            empty = false;
            boiled = false;

        }
        System.out.println("already full");
    }

    public boolean isEmpty(){
        System.out.println("empty");
        return empty;

    }

    public boolean isBoiled(){
        System.out.println("boiled");
        return boiled;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("draining");
            empty = true;
        }
        System.out.println("already empty");
    }

    public void boil(){
        if(!isEmpty() && isBoiled() ){
            System.out.println("boiled");
            boiled = true;
        }
        System.out.println("either empty or not boiled?");
    }





    }



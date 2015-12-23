package DesignPatterns.Singleton;

/**
 * A singleton class is to ensure that only a single instance of the class (an object) can
 * be created.
 */
public class Singleton {

    /**
     * Static variable to hold one instance of the class singleton
     *
     **/
    private static Singleton uniqueInstance;
    //other useful instance variables

    /**
     *  Constructor is private so only Singleton can instantiate this class.
     */
    private Singleton(){}

    /**
     * The getInstance() method gives us a way to instantiate the class and return an
     * instance of it.  The synchronized keyword ensures that every thread waits its turn
     * for access to the method.
     */
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}

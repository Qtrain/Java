package OOP.Charge_Sedgwick;

//<editor-fold desc="API for this class">
/*
This would be the API to use this class.  An important concept in Java Programming
- you do not need to know how a data type is implemented to be able to use it

public class Charge
--------------------------------------------------------------------------------
This is the constructor

    Charge(double x0, double y0, double q0)

These are instance methods.  The most important difference between a variable of
reference type vs primitive type is that you can use reference type variables
to invoke methods that implement data type operations.

    double potentialAt(double x, double y)
    String toSting()

The two parts of using this class would be:

    1. Create an object

        ClassName   object   =  new   ClassName (invoke Constructor)
        ---------   ------      ---   ---------  -----------------
        Charge      C        =  new    Charge     (2.2, 3.4, 7.2)

    2. Use instance methods on object

        C.potentialAt(2.3, 4.2)
*/
//</editor-fold>

public class Charge {

    //first declare instance variables which are usually private
    private final double rx;
    private final double ry;
    private final double q;


    //<editor-fold desc="Constructor Definition">
    /* A class contains constructors that are invoked to create objects from a
    class blueprint. Constructor declarations look like method declarations 
    -except that they use the name of the class and have no return type.  
    Constructor must be capitalized. Classes and Constructors are capitalized 
    methods are not.
    */
    //</editor-fold>

    //Constructor
    public Charge(double x0, double y0, double q0) {

        rx = x0;
        ry = y0;
        q = q0;

    }

//  The method to compute electrical potential which is defined by the equation V = kq/r
    public double potentialAt(double x, double y){

        double k = 8.99e09;  //Electrostatic Constant that k=8.99 X 10^9 Nm^2/C^2 (N = Newtons, m = meters, C = Coloumbs)

        //r = delta x - delta y
        double dx = x - rx; //delta x for distance
        double dy = y - ry; //delta y for distance
        return k*q/Math.sqrt(dx*dx + dy*dy);//computation using distance formula

    }

}



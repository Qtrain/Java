package OOP.Charge_Sedgwick;

import java.util.*;


public class ChargeClient {

    public static void main(String[] args) {


        //Using a scanner object to get values
        System.out.println("Please enter an X Value");
        Scanner in = new Scanner(System.in);
        // get values from command line for x and y
        double x = in.nextDouble();

        System.out.println("Please enter a Y Value");
        double y = in.nextDouble();

        //<editor-fold desc="Instantiating an object and invoking constructor">
        /*
            1. Instantiate objects C1 and C2

                ClassName   object   =  new   ClassName (invoke Constructor)
                ---------   ------      ---   ---------  -----------------
                Charge      C        =  new    Charge     (2.2, 3.4, 7.2)

            2. we are invoking constructor from API

                Charge(double x0, double y0, double q0)
        */
        //</editor-fold>

        Charge c1 = new Charge(.51, .63, 21.3);
        Charge c2 = new Charge(.13, .94, 81.9);

        //print out charge so we know what we are dealing with
        System.out.println(c1);
        System.out.println(c2);

        /*
          Here we create variables to hold the return from our potential method
          which is enacted on our C1 and C2 objects.

            1. We call a method on an object by:

                objectName.methodName(appropriate parameters)

        */
        double v1 = c1.potentialAt(x, y);
        double v2 = c2.potentialAt(x, y);

        //Concatenate results and print them out.
        System.out.println(v1+v2);

        System.out.println("this is the printf statement");
        System.out.printf("%.2E\n", v1+v2);
    }
}



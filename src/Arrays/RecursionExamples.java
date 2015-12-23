package Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qtrain
 */
public class RecursionExamples {

    public static void main(String[] args) {

        int number = -1023;
        //superWriteVertical(number);
        //test_b(4);
        test_a(4);
    }

    static void superWriteVertical(int number) // Postcondition: The digits of the number have been written, 
    // stacked vertically.  If number is negative, then a negative       
    // sign appears on top.      
    {
        if (number < 0) {
            System.out.println("-");
            System.out.println("call1");
            superWriteVertical(-number);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            superWriteVertical(number / 10);
            System.out.println("call");
            System.out.println(number % 10);
        }
    }

    public static void test_b(int n) {

        if (n > 0) {
            test_b(n - 2);
        }

        System.out.print(n + " ");

    }

    public static void test_a(int n) {

        System.out.println(n + " ");

        if (n > 0) {
            test_a(n - 2);
        }

    }

}

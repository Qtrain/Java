package Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author qtrain
 */
public class ArrayExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {





        //initialize an array manually
        int[] testArray = new int[]{1, 5, 3, 7};

        //initialize an array with random values, an integer variable and a loop
        //array is casted here using (int)
        double[] doubleArray = new double[5];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (Math.random() * 10);
        }

        System.out.println("***************************");
        System.out.println("* this is the first array *");
        System.out.println("***************************");
        System.out.println(Arrays.toString(testArray));//One way to print an array to make it look pretty
        System.out.println("************************");
        maxOfArray(testArray);

        System.out.println("");
        System.out.println("*************************");
        System.out.println("* printing double Array *");
        System.out.println("*************************");
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("************************");
        System.out.println("Average of Values");
        averageOfArray(doubleArray);

        System.out.println("");
        System.out.println("*************************");
        System.out.println("* printing test int Array *");
        System.out.println("*************************");
        System.out.println(Arrays.toString(testArray));
        System.out.println("************************");
        copyToArray(testArray);
    }

    public static int maxOfArray(int[] a) {

        //initialize a max value to the zero index
        int max = a[0];
        //initialize i to one so you can compare and swap
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[0]) {
                max = a[i];
            }
        }

        return max;

    }

    public static double averageOfArray(double[] a) {

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        double average = sum / a.length;

        System.out.println(average);
        return average;
    }

    public static void copyToArray(int[] a) {

        int j = 0;
        //manual copy there is also a system.arrayCopy
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
            j+=1;
            System.out.println("iteration " + j);
            System.out.println(Arrays.toString(a)+Arrays.toString(b));
        }

    }

}

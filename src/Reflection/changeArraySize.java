package Reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.System.currentTimeMillis;

/**
 * 1. print methods from class
 */
public class changeArraySize {
    public static void main(String[] args) {

//
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        //Original Array
//        System.out.println("original array");
//        System.out.println(Arrays.toString(array));
//
////        //array for new size
////        System.out.println("\nnew array");
////        int[] arrayForCopy = (int[]) changeArraySize(array, 20);
////        print(arrayForCopy);
//
//        System.out.println("\n\nGet methods using reflection method");
//        //get methods method
//        getMethodsUsingReflection(Arrays.class);
//
//        System.out.println("\n Get constructors using awesomeness incantation");
//        getConstructorsUsingReflection(String.class);
//
//        System.out.println("\n get fields using magic");
//        getFieldsUsingReflection(LivingRoom.class);

        System.out.println("\n fuck yeah");
        getMethodTimes(String.class);
    }

    /**********************
     * change array size
     ******************************/
//    //change array size with reflection
//    public static Object changeArraySize(Object obj, int len) {
//        Class<?> arr = obj.getClass().getComponentType();
//        Object newArray = Array.newInstance(arr, len);
//
//        //make array copy
//        int co = Array.getLength(obj);
//        System.arraycopy(obj, 0, newArray, co, 10);
//        return newArray;
//    }

    /***********************
     * print method
     **********************************/

    //print method
    public static void print(Object o) {
        Class<?> c = o.getClass();
        if (!c.isArray()) {
            return;
        }
        System.out.print("Array length: " + Array.getLength(o) + "\n");

        for (int i = 0; i < Array.getLength(o); i++) {
            System.out.print(Array.get(o, i) + " ");

        }
    }

    /****************
     * array of methods
     *******************************/
    //method to get array of methods from object
    public static void getMethodsUsingReflection(Class c) {
        Method[] methods = c.getMethods();

        for (Method m : methods) {
            System.out.println(m);
        }
    }

    /*************
     * array of constructors
     ************************/
    public static void getConstructorsUsingReflection(Class c) {
        Constructor[] constructors = c.getConstructors();

        for (Constructor i : constructors) {
            System.out.println("Constructors = " + i);
        }
    }

    /*******************
     * array of fields
     ***************************/
    public static void getFieldsUsingReflection(Class c) {
        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {
            System.out.println("Fields = " + f);
        }
    }

    public static void getdClass(Class<?> cls) {

        try {

            Object obj = cls.newInstance();
            obj = "hello";


            Method reflectedMethod = cls.getDeclaredMethod("hashCode");
            System.out.println("yo" + reflectedMethod.invoke(obj));

//            reflectedMethod = cls.getDeclaredMethod("setTelevision");
//            reflectedMethod.invoke(obj, "75 inches");

//            reflectedMethod = cls.getDeclaredMethod("setTelevision");
//            reflectedMethod.invoke(obj);
////

        } catch (Exception ex) {
            System.out.println("stack trace");
            ex.printStackTrace();
        }
    }

    public static long getMethodTimes(Class c) {
        long startTime = currentTimeMillis();
        getdClass(c);
        System.out.println("Time passed = " + (currentTimeMillis() - startTime));
        System.out.println(startTime);
        return startTime;
    }

}


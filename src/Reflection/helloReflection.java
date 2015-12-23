package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by macbook on 12/6/15.
 */
public class helloReflection {
    public static void main(String[] args) {

        //get methods from a class
        Method[] aClassMethods = LivingRoom.class.getMethods();

        for (Method m : aClassMethods){
            System.out.println("method = " +m);
        }

                //create an object from a class instance if class name is known
                Class<?> c = null;
                try{
                    c=Class.forName("Reflection.Foo");
                }catch(Exception e){
                    e.printStackTrace();
                }

                //create instance of "Foo"
                Foo f = null;

                try {
                    f = (Foo) c.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //get constructor
                Constructor<?> cons[] = c.getConstructors();
                f.print();
            }

        }

        //get constructors


        class Foo {
            public void print() {
                System.out.println("abc");
            }
        }



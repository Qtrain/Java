package DesignPatterns.Singleton;

/**
 * Created by macbook on 11/10/15.
 */
public class Client {
        public static void main(String[] args) {

                ChocolateBoiler tmp = ChocolateBoiler.getInstance();
                tmp.isBoiled();
        }

}

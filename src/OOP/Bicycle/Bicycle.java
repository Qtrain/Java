package OOP.Bicycle;

/**
 * Created by macbook on 9/12/15.
 */
interface Bicycle {

    void speedUp(int newValue);
    void brake(int newValue);
    void color(String color);
}

class MountainBike implements Bicycle{

    int speed=20;
    String color="red";

    @Override
    public void speedUp(int newValue) {
        speed += newValue;

    }

    @Override
    public void brake(int newValue) {
        speed -= newValue;
    }

    @Override
    public void color(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        MountainBike mikesBike = new MountainBike();

        System.out.println(mikesBike.toString());
        mikesBike.brake(3);
        System.out.println(mikesBike.toString());
        mikesBike.speedUp(4);
        System.out.println(mikesBike.toString());
    }
}
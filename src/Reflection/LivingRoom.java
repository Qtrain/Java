package Reflection;

/**
 * Created by macbook on 12/6/15.
 */
public class LivingRoom {
    String couch = "LEATHER";
    String television = "WISHITWASBIGGER";
    String coffeeTable = "CHINATOWNNONSENSE";

    public LivingRoom(String couch, String television, String coffeeTable) {
        this.couch = couch;
        this.television = television;
        this.coffeeTable = coffeeTable;
    }

    public String getCouch() {
        return couch;
    }

    public void setCouch(String couch) {
        this.couch = couch;
    }

    public String getTelevision() {
        System.out.println(television);
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public String getCoffeeTable() {
        return coffeeTable;
    }

    public void setCoffeeTable(String coffeeTable) {
        this.coffeeTable = coffeeTable;
    }
}

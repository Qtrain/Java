package APITreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by macbook on 12/23/15.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //create a hash map
        TreeMap tm = new TreeMap();

        //put some stuff into it as a key/value pair
        tm.put("mike", new Integer(33));
        tm.put("matt", new Integer(30));
        tm.put("steve", new Integer(27));

        //get a set of entries
        Set set = tm.entrySet();

        //get an iterator
        Iterator i = set.iterator();

        //display elements
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.print(me.getValue());
            System.out.println();
        }
    }
}

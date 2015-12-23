 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;
import java.util.*;

/**
 *
 * @author qtrain
 */
public class ArrayBagClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
       
        
        
        ArrayBag arrayBag = new ArrayBag();
        String myName = new String("mike");
        
        arrayBag.add(myName);
        
        ArrayBag<Integer> arrayBag2 = new ArrayBag<Integer>();
        int i = 1;
        Integer wrap = new Integer(i);        
        arrayBag2.add(i);
        arrayBag2.add(i);
        System.out.println(arrayBag2.countOccurrences(i));
        
        
        
        
        
    }
    
}


package Collections;

import Collections.GenericLinkedBag;


/**
 *
 * @author Michael Quatrani
 */
public class GenericLinkedBagClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * How to declare generic list objects:
         */
         System.out.println("Bag with Linked List implementation that accepts generic parameters: testing int");
         GenericLinkedBag<Integer> list1 = new GenericLinkedBag<Integer>();
         list1.addMany(1,2,3,5,6);
         list1.printList();
         System.out.println();
         System.out.println("Testing String");
         GenericLinkedBag<String> list2 = new GenericLinkedBag<String>();
         list2.addMany("abc","bca","cba");
         list2.printList();
    }
    
}

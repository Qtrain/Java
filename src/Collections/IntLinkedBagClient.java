
package Collections;



/**
 *
 * @author Michael Quatrani
 */
public class IntLinkedBagClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //declare some list objects
         IntLinkedBag List = new IntLinkedBag();
         IntLinkedBag List2 = new IntLinkedBag();
         IntLinkedBag List3 = new IntLinkedBag();
         IntLinkedBag List4 = new IntLinkedBag();
         IntLinkedBag List5 = null;
         
         List5.add(1);
	
         //add some elements to the list
         List.addMany(1,3,4,5);
         List2.addMany(5,3,2,0,7);
         List3.addMany(7,7,7,7,7,7,7);
         List4.addMany(7,7);
         
         //Print lists to visualize whats going on
         System.out.println("Lists before subtraction");
         System.out.println(" ---------------------- ");
         System.out.println("List 1");
         List.printList();
         System.out.println("");
         System.out.println("List 2");
         List2.printList();
         System.out.println("");
         System.out.println("");
         System.out.println("Subtract List 2 from List 1");
         System.out.println("---------------------------");
         List.subtract(List2);
         List.printList();
         System.out.println("");
         
         //book example
         System.out.println("---------------------------------------");
         System.out.println("Lists before subtraction (book example)");
         System.out.println("---------------------------------------");
         System.out.println("List 3");
         List3.printList();
         System.out.println("");
         System.out.println("List 4");
         List4.printList();
         System.out.println("");
         System.out.println("");
         System.out.println("Subtract List 4 from List 3");
         System.out.println("---------------------------");
         List3.subtract(List4);
         List3.printList();
         
    }
    
}

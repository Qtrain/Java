package BstCmu;

/**
 *
 * @author qtrain
 */
public class BstCmuClient {

    public static void main(String[] args) {
        Integer[] a = {14, 2, 11, 1, 3, 10, 30, 7, 40};
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        for (Integer n : a) {
            bst.insert(n);
        }

        
        bst.preOrderTraversal();
        System.out.println("ppp");

        //testing comparator
        //build a mirror BinarySearchTree with a rule:  Left > Parent > Right
        //code for the comparator at the bottom of the file
        bst = new BinarySearchTree<Integer>(new MyComp1());
        for (Integer n : a) {
            bst.insert(n);
        }
        System.out.println("This is the pre order traversal");
        System.out.println("-------------------------------");
        bst.preOrderTraversal();
        System.out.println();
        System.out.println("This is the in order traversal");
        System.out.println("------------------------------");
        bst.inOrderTraversal();
        System.out.println();

        for (Integer n : bst) {
            System.out.print(n);
        }
        System.out.println();

        System.out.println(bst);

        //testing restoring a tree from two given traversals
        bst.restore(new Integer[]{11, 8, 6, 4, 7, 10, 19, 43, 31, 29, 37, 49},
                new Integer[]{4, 6, 7, 8, 10, 11, 19, 29, 31, 37, 43, 49});
        bst.preOrderTraversal();
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();

        //testing diameter
        System.out.println("diameter = " + bst.diameter());
        //testing width
        System.out.println("width = " + bst.width());
    }

}

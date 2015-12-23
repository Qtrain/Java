package BinarySearchSedgewick;

/**
 *
 * @author qtrain
 */
public class BSTClient {
       /*****************************************************************************
    *  Test client
    *****************************************************************************/
    public static void main(String[] args) { 
        BST<String, Integer> st = new BST<String, Integer>();
        String[] a = {"a", "b", "d", "c", "e", "f", "g", "h"};
        for (int i = 0; i<8; i++) {
            st.put(a[i], i);
        }

        for (String s : st.levelOrder())
            StdOut.println(s + " " + st.get(s));

        StdOut.println();

        for (String s : st.keys())
            StdOut.println(s + " " + st.get(s));
    }
}

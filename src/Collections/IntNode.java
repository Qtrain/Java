// File: IntNode.java from the package edu.colorado.nodes
// Complete documentation is available from the IntNode link in:
//   http://www.cs.colorado.edu/~main/docs

package Collections;


/******************************************************************************
* An IntNode provides a node for a linked list with 
* integer data in each node.
*
* @note
*   Lists of nodes can be made of any length, limited only by the amount of
*   free memory in the heap. But beyond Integer.MAX_VALUE (2,147,483,647),
*   the answer from listLength is incorrect because of arithmetic
*   overflow. 
*
* @see
*   <A HREF="../../../../edu/colorado/nodes/IntNode.java">
*   Java Source Code for this class
*   (www.cs.colorado.edu/~main/edu/colorado/nodes/IntNode.java)</A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version
*   March 6, 2002
*
* @see Node
* @see BooleanNode
* @see ByteNode
* @see CharNode
* @see DoubleNode
* @see FloatNode
* @see LongNode
* @see ShortNode
******************************************************************************/
public class IntNode {

   // Invariant of the IntNode class:
   //   1. The node's integer data is in the instance variable data.
   //   2. For the final node of a list, the link part is null.
   //      Otherwise, the link part is a reference to the
   //      next node of the list.
    // Q: Is the last b/c it is initialized to null
    private int data;
    private IntNode link;

    
   /**
   * Initialize a node with a specified initial data and link to the next
   * node. Note that the initialLink may be the null reference, 
   * which indicates that the new node has nothing after it.
   * @param initialInteger
   *   the initial integer of this new node but why not make it generic
   * @param initialLink
   *   a reference to the node after this new node--this reference may be null
   *   to indicate that there is no node after this new node.
   * @postcondition
   *   This node contains the specified data and link to the next node.
   **/   
    public IntNode(int initialInteger, IntNode initialLink) {
        data = initialInteger;
        link = initialLink;
    }


    /**
     * getter that returns data (in this class integer but we should make this generic)
       * @return data(Integer)
     * */
    public int getData() {
        return data;
    }
    /**
     * gets the link of the next node - Remember that getting links is recursive in nature.
     * @return link
     */
    public IntNode getLink() {
        return link;
    }
    
    /**
     * sets new Integer.
     * @param newData 
     */
    public void setData(int newData) {
        data = newData;
    }
    
    /**
     * sets new link
     * @param newLink 
     */
    public void setLink(IntNode newLink) {
        link = newLink;
    }

      /**
   * Modification method to add a new node after this node.   
   * @param integer
   *   the data to place in the new node
   * @postcondition
   *   A new node has been created and placed after this node.
   *   The data for the new node is item. Any other nodes
   *   that used to be after this node are now after the new node.
   * @exception OutOfMemoryError
   *   Indicates that there is insufficient memory for a new 
   *   IntNode.
   * @see 
   *    Hey look this is recursive.  That would have been nice to know.
   **/
    public void addNodeAfter(int integer) {
        link = new IntNode(integer, link);
        data++;
    }
    
       /**
   * Modification method to remove the node after this node.   
   * @param - none
   * @precondition
   *   This node must not be the tail node of the list.
   * @postcondition
   *   The node after this node has been removed from the linked list.
   *   If there were further nodes after that one, they are still
   *   present on the list.
   * @exception NullPointerException
   *   Indicates that this was the tail node of the list, so there is nothing
   *   after it to remove
   * @see 
   *  Q: This is confusing as shit text says "go to the node that the link refers to and use the link instance variable.  I think this is using the getter.  need clarification..
   **/
    public void removeNodeAfter() {
        link = link.link;
    }
    
       /**
   * Compute the number of nodes in a linked list.
   * @param head
   *   the head reference for a linked list (which may be an empty list
   *   with a null head)
   * @return
   *   the number of nodes in the list with the given head 
   * @note
   *   A wrong answer occurs for lists longer than Int.MAX_VALUE.     
   **/   
    public static int listLength(IntNode head) {
        IntNode cursor;
        int answer;

        //this is list traversal same concept as a for loop
        answer = 0;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        }

        return answer;
    }
    
       /**
   * Search for a particular piece of data in a linked list.
   * @param head
   *   the head reference for a linked list (which may be an empty list in
   *   which case the head is null)
   * @param target
   *   a piece of data to search for
   * @return
   *   The return value is a reference to the first node that contains the
   *   specified target. If there is no such node, the null reference is 
   *   returned.     
   **/ 
    public static IntNode listSearch(IntNode head, int target) {
        IntNode cursor;
        
        //I think this is also traversal
        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }

        return null;
    }
    
   /**
   * Find a node at a specified position in a linked list.
   * @param head
   *   the head reference for a linked list (which may be an empty list in
   *   which case the head is null)
   * @param position
   *   a node number
   * @precondition
   *   position > 0.
   * @return
   *   The return value is a reference to the node at the specified position in
   *   the list. (The head node is position 1, the next node is position 2, and
   *   so on.) If there is no such position (because the list is too short),
   *   then the null reference is returned.
   * @exception IllegalArgumentException
   *   Indicates that position is not positive.    
   **/   
    public static IntNode listPosition(IntNode head, int position) {
        IntNode cursor;
        int i;

        if (position <= 0) {
            throw new IllegalArgumentException("position is not positive");
        }

        cursor = head;
        for (i = 1; (i < position) && (cursor != null); i++) {
            cursor = cursor.link;
        }

        return cursor;
    }

   /**
   * Copy a list.
   * @param source
   *   the head of a linked list that will be copied (which may be
   *   an empty list in where source is null)
   * @return
   *   The method has made a copy of the linked list starting at 
   *   source. The return value is the head reference for the
   *   copy. 
   * @exception OutOfMemoryError
   *   Indicates that there is insufficient memory for the new list.   
   **/ 
    public static IntNode listCopy(IntNode source) {
        
        //Why aren't we declaring these as fields at the top of the class
        IntNode copyHead;
        IntNode copyTail;

        // Handle the special case of the empty list.
        if (source == null) {
            return null;
        }

        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null) {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head reference for the new list.
        return copyHead;
    }

   /**
   * Copy a list, returning both a head and tail reference for the copy.
   * @param source
   *   the head of a linked list that will be copied (which may be
   *   an empty list in where source is null)
   * @return
   *   The method has made a copy of the linked list starting at 
   *   source.  The return value is an
   *   array where the [0] element is a head reference for the copy and the [1]
   *   element is a tail reference for the copy.
   * @exception OutOfMemoryError
   *   Indicates that there is insufficient memory for the new list.   
   **/
    public static IntNode[] listCopyWithTail(IntNode source) {
        IntNode copyHead;
        IntNode copyTail;
        IntNode[] answer = new IntNode[2];

        // Handle the special case of the empty list.   
        if (source == null) {
            return answer; // The answer has two null references .
        }
        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null) {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references.
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }
    
        //print out nodes in linked list
    public void printList(IntNode head) {
        IntNode cursor;
        int count = 0;
        //COUNTING THE NODES!
        for (cursor = head; cursor != null; cursor = cursor.link) {
            count++;
//	    System.out.println("Node " + count + 
            //                     "is" + cursor.getData());
            System.out.println(cursor.getData() + "--->");
            System.out.println("size of list " + count);
        }
    }
    
//    public void subtract(IntNode head, int removeInt){
//    IntNode cursor;
//    
//    for (cursor=head; cursor!=null; cursor=cursor.link){
//        if (removeInt == cursor.data){
//            cursor.remove(data);
//        }
//    }
//    
//    }


    /**
   * Copy part of a list, providing a head and tail reference for the new copy. 
   * @param start/end
   *   references to two nodes of a linked list
   * @param copyHead/copyTail
   *   the method sets these to refer to the head and tail node of the new
   *   list that is created
   * @precondition
   *   start and end are non-null references to nodes
   *   on the same linked list,
   *   with the start node at or before the end node. 
   * @return
   *   The method has made a copy of the part of a linked list, from the
   *   specified start node to the specified end node. The return value is an
   *   array where the [0] component is a head reference for the copy and the
   *   [1] component is a tail reference for the copy.
   * @exception IllegalArgumentException
   *   Indicates that start and end are not references
   *   to nodes on the same list.
   * @exception NullPointerException
   *   Indicates that start is null.
   * @exception OutOfMemoryError
   *   Indicates that there is insufficient memory for the new list.    
   **/   
    public static IntNode[] listPart(IntNode start, IntNode end) {
        
        //again what is going on here with these instance variables.
        IntNode copyHead;
        IntNode copyTail;
        IntNode cursor;
        IntNode[] answer = new IntNode[2];

        // Make the first node for the newly created list. Notice that this will
        // cause a NullPointerException if start is null.
        copyHead = new IntNode(start.data, null);
        copyTail = copyHead;
        cursor = start;

        // Make the rest of the nodes for the newly created list.
        while (cursor != end) {
            cursor = cursor.link;
            if (cursor == null) {
                throw new IllegalArgumentException("end node was not found on the list");
            }
            copyTail.addNodeAfter(cursor.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }
}

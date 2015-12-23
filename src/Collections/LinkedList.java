package Collections;

public class LinkedList {

    //instance vars
    private IntNode head;
    private IntNode tail; //keeps track of last node!
    private int manyNodes;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.manyNodes = 0;
    }

    //adds a new node
    public void addFirst(int element) {
        head = new IntNode(element, head);
        tail = head;
        manyNodes++;
    }

    public void add(int element) {
        tail.addNodeAfter(element);
        tail = tail.getLink();
        manyNodes++;
    }

    //print out nodes in linked list
//    public void printList() {
//        Node cursor;
//        int count = 0;
//        //COUNTING THE NODES!
//        for (cursor = head; cursor != null; cursor = cursor.getLink()) {
//            count++;
////	    System.out.println("Node " + count + 
//            //                     "is" + cursor.getData());
//            System.out.println(cursor.getData() + "--->");
//        }
//    }

}

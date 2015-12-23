package Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author qtrain
 */
public class Node {

    //instance vars
    private int data;
    private Node link; //pointer to next Node

    //constructor
    public Node(int initialData, Node nextNode) {
        data = initialData;
        link = nextNode;
    }

    //accessor methods
    public int getData() {
        return data;
    }

    public Node getLink() {
        return link;
    }

    //mutator methods
    public void setData(int newData) {
        data = newData;
    }

    public void setLink(Node newLink) {
        link = newLink;
    }

	//helper method to add a new node
    // HOW TO INSERT A NODE !! //inserts AFTER current NODE
    public void addNodeAfter(int nodeData) {
        link = new Node(nodeData, getLink());
    }
	//HOW TO REMOVE A NODE !! --removes AFTER current NODE
    //breaks the chain and leaves 
    public void removeNodeAfter() {
        link = link.link;
    }

    //get length of list or how many nodes
    public static int listLength(Node head) {
        Node cursor;
        int length = 0;
        //COUNTING THE NODES!
        for (cursor = head; cursor != null; cursor = cursor.link) {
            length++;
        }
        return length;
    }

	//copies the source linked list into a new linked list
    // (p.203)
    public static Node listCopy(Node source) {
        Node copyHead;
        Node copyTail;

        //don't need to copy an empty list
        if (source == null) {
            return null;
        }

        copyHead = new Node(source.data, null);
        copyTail = copyHead;

        //copy rest of source nodes into newly created list
        while (source.link != null) {
            source = source.link; //bump it to next Node
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link; //bump tail to last Node
        }

        //return the new Linked List
        return copyHead;
    }

    //search through a list to find target
    public static Node listSearch(Node head, int target) {
        Node cursor;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }

        return null;
    }

}

package Collections.Queue;

/**
 * Created by macbook on 12/4/15.
 */
public class SdgwckQ<Item> {

    public int N;
    public Node first;
    public Node last;

    public void enqueue(Item item){
        Node oldLast = last; //new var store old last
        last = new Node(); //assign last to a new node
        last.item = item;  //use member variable
        last.next = null;
        if(isEmpty()){
            first = last;
        }
        else oldLast.next = last;
        N++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        N--;
        if(isEmpty()) last = null;
        return item;
    }

    public int size(){return N;}

    boolean isEmpty(){return first == null;}

    public Node peek(){
        return first;
    }
/*******nested class ******************/
    private class Node{
        Item item;
        Node next;
    }
}
/***************************** test client *********************************/
class testClient{
    public static void main(String[] args) {
        SdgwckQ queue = new SdgwckQ();

        queue.isEmpty();
        queue.enqueue(3);
        queue.enqueue("string");
        queue.peek();
    }
}
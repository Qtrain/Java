package Collections.Queue;

import java.util.Iterator;

/*
 * **************************************************************************
 * Author: Michael Quatrani 
 *
 * Compilation: javac Deque.java 
 * Execution: Use DequeClient.java
 *
 * This class implements a double-ended queue (deque) using a doubly linked
 * list. A deque is  a queue that supports
 * inserting and removing items from either the front or the back of the data
 * structure.
 *
 **************************************************************************
 */
public class Deque<Item> implements Iterable<Item> {

    // class to store each deque node
    private static class DequeNode<Item> {

        private Item item;    // the actual item
        private DequeNode<Item> next;    // pointer to next node
        //make list doubly linked forwards and backwards
        private DequeNode<Item> prev;    // pointer to previous node
    }

    private int size;       // size of the deque
    private final DequeNode<Item> head;       // first node 
    private final DequeNode<Item> tail;       // last node 

    // construct an empty deque
    public Deque() {
        size = 0;
        head = new DequeNode<Item>();
        tail = new DequeNode<Item>();
        head.next = tail;
        tail.prev = head;
    }

    // insert the item at the front
    public void enqueueFront(Item item) {

        DequeNode<Item> first = head.next;
        DequeNode<Item> node = new DequeNode<Item>();
        node.item = item;
        node.next = first;
        node.prev = head;
        head.next = node;
        first.prev = node;
        size++;
    }

    // insert the item at the end
    public void enqueueBack(final Item item) {
        if (item == null) {
            throw new java.lang.NullPointerException();
        }

        DequeNode<Item> last = tail.prev;
        DequeNode<Item> node = new DequeNode<Item>();
        node.item = item;
        node.next = tail;
        node.prev = last;
        tail.prev = node;
        last.next = node;
        size++;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return an iterator over items in order from front to end
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }

    // delete and return the item at the front
    public Item dequeueFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }

        DequeNode<Item> first = head.next;
        DequeNode<Item> next = first.next;
        next.prev = head;
        head.next = next;
        size--;

        return first.item;
    }

    // delete and return the item at the end
    public Item dequeueLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }

        DequeNode<Item> last = tail.prev;
        DequeNode<Item> prev = last.prev;
        tail.prev = prev;
        prev.next = tail;
        size--;

        return last.item;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // class to implement the deque iterator
    private class DequeIterator implements Iterator<Item> {

        private DequeNode<Item> current = head.next;

        public boolean hasNext() {
            return current != tail;
        }

        public Item next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            final Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class DequeClient {

    public static void main(String[] args) {

        Deque<String> people = new Deque<String>();
        //size is zero when first initialized
        System.out.println(people.size());

        people.enqueueFront("bob");
        people.enqueueFront("sally");
        people.enqueueFront("jehosifat");
        people.enqueueBack("John");
        people.enqueueBack("Lebron James");
        System.out.println("Print the size of the Deque and the people in it");
        System.out.println("------------------------------------------------");
        System.out.println(people.size());
        for (String s : people) {
            System.out.println(s);
        }
        System.out.println("");

        System.out.println("Take first person out and print the size of the Deque and the people in it");
        System.out.println("--------------------------------------------------------------------------");
        people.dequeueFirst();
        System.out.println(people.size());
        for (String s : people) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Take the last person out and print the size of the Deque and the people in it");
        System.out.println("--------------------------------------------------------------------------");
        people.dequeueLast();
        System.out.println(people.size());
        for (String s : people) {
            System.out.println(s);
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;

/**
 *
 * <h2>Generic Stack</h2>
 * <p>
 * Generic stack that uses a diamond generic <Item> to allow any ADT (primitives
 * can be used with a wrapper class see <a
 * href="http://docs.oracle.com/javase/tutorial/java/data/autoboxing.html">
 * Autoboxing</a>) to be used in a stack data structure. Implementing iterable
 * allows use of the java for each statement so that you can write clear and
 * compact code for iterating through each
 * <Item> in a collection. Example syntax for (String s : Collection)
 * System.out.println(s). Also see <a
 * href="http://stackoverflow.com/questions/16781649/real-world-application-of-widening-narrowing-conversion">Widening
 * and Narrowing</a>
 */
public class GenericStack<Item> implements Iterable<Item>, Cloneable {

    private int N = 0;//Stack Entries
    //read as private item array data
    private Item[] data = (Item[]) new Object[1];

    /**
     *
     * @param capacity
     */
    GenericStack(int capacity) {

        data = (Item[]) new Object[capacity];

    }

    /**
     *
     * @param max
     * @see This method is to dynamically resize the array to avoid overflow. It
     * works in tandem with the push method.
     */
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];

        //simple swap
        for (int i = 0; i < N; i++) {
            temp[i] = data[i];
            data = temp;
        }

    }

    /**
     *
     * @param item
     * @see This works in tandem with the resize method to insure we don't have
     * overflow issues.
     */
    public void push(Item item) {
        if (N == data.length) {
            resize(2 * data.length);
        }
        data[N++] = item;

    }

    /**
     *
     * @return The stack with the top item removed. LIFO.
     */
    public Item pop() {

        Item item = data[--N];

        data[N] = null;//avoid loitering
        if (N > 0 && N == data.length / 4) {
            resize(data.length);
        }
        return item;
    }

    /**
     *
     */
    @Override
    public Iterator<Item> iterator() {

        return new ReverseArrayIterator();

    }

    private class ReverseArrayIterator implements Iterator<Item> {//support LIFO iteration

        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return data[--i];
        }

        public void remove() {
        }

    }

    /**
     * Generate a copy of this stack.
     *
     * @param - none
     * @return The return value is a copy of this stack. Subsequent changes to
     * the copy will not affect the original, nor vice versa.
     * @exception OutOfMemoryError Indicates insufficient memory for creating
     * the clone.
     *
     */
    public GenericStack<Item> clone() {  // Clone an ArrayStack.
        GenericStack<Item> answer;

        try {
            answer = (GenericStack<Item>) super.clone();
        } catch (CloneNotSupportedException e) {
            // This exception should not occur. But if it does, it would probably indicate a
            // programming error that made super.clone unavailable. The most comon error
            // The most common error would be forgetting the "Implements Cloneable"
            // clause at the start of this class.
            throw new RuntimeException("This class does not implement Cloneable" + e.getMessage());
        }

        answer.data = data.clone();

        return answer;
    }

    public Item peek() {
        if (N == 0) // EmptyStackException is from java.util and its constructor has no argument.
        {
            throw new EmptyStackException();
        }
        return data[N - 1];
    }

    /**
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     *
     * @return The size of the current stack.
     */
    public int size() {

        return N;

    }

}

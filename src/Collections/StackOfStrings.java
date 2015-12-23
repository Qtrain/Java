/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

/**
 * <h2>Stack of Strings<h2>
 *This class has many drawbacks because it will only accept Strings.  If we wanted to use
 * any other parameter we would have to rewrite the class.  This illustrates the power
 * of generics.
 * @author qtrain
 */
public class StackOfStrings {
    
    //instance variables
    private int N;
    private String[] a;
    
    /**
     * 
     * Constructor
     * @param: String
     */
    public StackOfStrings(int capacity){
        a = new String[capacity];
    }
    
    /**
     * @return 0 if is empty
     * 
     */
    public boolean isEmpty(){
        
        return N==0;
    }
    
    /**
     * 
     * @return The number of items in the stack
     */
    public int size(){
    
        return N;
    }
    /**
     * @param item
     * @see Pushes an item on to the stack by incrementing the Number given to the Array by 1.
     * This is a <b>L</b>ast <b>I</b>n <b>F</b>irst <b>O</b>ut Stack.
     */
    public void Push(String item){
        a[N++]=item;
    }
    /**
     * 
     * 
     * @return 
     */
    public String pop(){
        return a[--N];
    
    }
    
}

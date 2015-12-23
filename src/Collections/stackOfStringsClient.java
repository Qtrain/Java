/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

/**
 *
 * @author qtrain
 * 
 */
public class stackOfStringsClient {
    
    public static void main(String[] args) {
        
        StackOfStrings s = new StackOfStrings(100);
        
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.Push(item);
            }
            else if(!s.isEmpty()){
                StdOut.print(s.pop()+"");
            }
        }
        
    }
    
}

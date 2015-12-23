/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BookBTNode;

import BookBTNode.BTNode;

/**
 *
 * @author qtrain
 */
public class BTNodeClient {
    
    public static void main(String[] args) {
        
       int  a = 14;
       int left = 2;
       int right = 11;
       
       BTNode<Integer> root = new BTNode<Integer>(a, null, null);
       BTNode<Integer> child = new BTNode<Integer>(left, null, null);
       BTNode<Integer> childRight = new BTNode<Integer>(right, null, null);

       root.setLeft(child);
       root.setRight(childRight);
      
    }
    
}


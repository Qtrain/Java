/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.subclasses;

// File: Plant.java from the package edu.colorado.simulations
// Complete documentation is available from the Plant link in
//   http://www.cs.colorado.edu/~main/docs/
/**
 * ****************************************************************************
 * A <CODE>Plant</CODE> is an <CODE>Organism</CODE> with extra methods that
 * allow it to be eaten.
 * 
* <dt><b>Java Source Code for this class:</b><dd>
 * <A HREF="../../../../edu/colorado/simulations/Plant.java">
 * http://www.cs.colorado.edu/~main/edu/colorado/simulations/Plant.java
 * </A>
 * 
* @author Michael Main
 * <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
 * 
* @version Jun 12, 1998
 * 
* @see Organism
*****************************************************************************
 */
public class Plant extends Organism {

    /**
     * Construct a <CODE>Plant</CODE> with a specified size and growth rate.
     *
     * @param <CODE>initSize</CODE> the initial size of this <CODE>Plant</CODE>,
     * in ounces
     * @param <CODE>initRate</CODE> the initial growth rate of this
     * <CODE>Plant</CODE>, in ounces
     * <dt><b>Precondition:</b><dd>
     * <CODE>initSize >= 0</CODE>. Also, if <CODE>initSize</CODE> is zero, then
     * <CODE>initRate</CODE> must also be zero.
     * <dt><b>Postcondition:</b><dd>
     * This <CODE>Plant</CODE> has been initialized. The value returned from
     * <CODE>getSize()</CODE> is now <CODE>initSize</CODE>, and the value
     * returned from <CODE>getRate()</CODE> is now <CODE>initRate</CODE>.
     * @exception IllegalArgumentException Indicates that <CODE>initSize</CODE>
     * or <CODE>initRate</CODE> violates the precondition.
   *
     */
    public Plant(double initSize, double initRate) {
        super(initSize, initRate);
    }

    /**
     * Have this <CODE>Plant</CODE> lose some of its size by being eaten.
     *
     * @param <CODE>amount</CODE> The amount of this <CODE>Plant</CODE> that is
     * eaten (in ounces).
     * <dt><b>Precondition:</b><dd>
     * <CODE>0 <= amount <= getSize()</CODE>.
   * <dt><b
     * >Postcondition:</b><dd>
     * The size of this <CODE>Plant</CODE> has been decreased by
     * <CODE>amount</CODE>. If this reduces the size to zero, then
     * <CODE>expire</CODE> is activated.
   *
     */
    public void nibbledOn(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount is negative");
        }
        if (amount > getSize()) {
            throw new IllegalArgumentException("amount is more than size");
        }
        alterSize(-amount);
    }
}

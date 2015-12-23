package OOP.Stack_Of_Integers;

/**
 * Created by macbook on 9/13/15.
 */
public class StackOfIntegers_Main {

    public static void main(String[] args) {
        StackOfIntegers newStack = new StackOfIntegers();

        newStack.empty();
        newStack.getSize();
        newStack.push(3);
        newStack.push(4);
        System.out.println(newStack.peek());
    }
}

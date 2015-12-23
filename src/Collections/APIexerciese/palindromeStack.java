package Collections.APIexerciese;

import java.util.Stack;

/**
 * Created by macbook on 12/4/15.
 */
public class palindromeStack {


    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String palindromeTestStringOne = "I am a palindrome";
        String getPalindromeTestStringTwo = "hi how woh ih";

        for(int i = 0; i< palindromeTestStringOne.length(); i++){
            stack.push(palindromeTestStringOne.charAt(i));
        }

        String reverse = "";

        while(!stack.isEmpty()){
            reverse += stack.pop();
        }

        if(palindromeTestStringOne.equals(reverse)){
            System.out.println("we have a palindrome");
        }

        System.out.println("ND");


    }
}

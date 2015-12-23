/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Scanner;

/**
 *
 * @author qtrain
 */
public class GenericStackClient {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String pal;
        String formattedString;
        String reverseString = "";

        //get string from user
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string to test if it is a palindrome");
        pal = in.nextLine();
        System.out.println("Entered String is:");
        System.out.println("------------------");
        System.out.println(pal);
        System.out.println("");

// test cases
//        pal = "eva, can i stab bats in a cave";//test case punctuation
//        pal = "GoOooG";//test case captial
//        pal = "A Ma N a PLan a canal panama";//test case spaces
//        pal = "test case not a palindrome";
//        Url for a  17,826 word palindrome http://norvig.com/pal17txt.html
        
        //call format string to remove punctuation and lowercase
        formattedString = formatString(pal);

        //declare generic stack object
        GenericStack<Character> palStack = new GenericStack<Character>(4 * pal.length());

// stack size says zero here which is weird????  
// Need a better understanding of how my stack is sizing.
// Not sure why I need to do 4 times pal.length..
//      System.out.println(palStack.size());
        
        //push characters on to stack
        for (int i = 0; i < formattedString.length(); i++) {
            palStack.push(formattedString.charAt(i));
        }

        //show size of stack to user
        System.out.println("Size of stack");
        System.out.println("-------------");
        System.out.println(palStack.size());
        System.out.println("");

        //load up a string with the reverse
        while (!palStack.isEmpty()) {
            reverseString += palStack.pop();
        }

        //show the user what strings the program is using
        System.out.println("String with removed punctuation and lowercase");
        System.out.println("---------------------------------------------");
        System.out.println(formattedString);
        System.out.println("");
        System.out.println("String reversed to compare");
        System.out.println("--------------------------");
        System.out.println(reverseString);
        System.out.println("");

        //test if string is palindrome
        if (formattedString.equals(reverseString)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("No dice. Not a palindrome");

        }
    }

    /**
     *
     * @param inputString
     * @return
     */
    //static method (function) to format string
    public static String formatString(String inputString) {

        String finalString = "";
        //make letter lowercase
        String lowerCaseString = inputString.toLowerCase();
        //remove punctuation and whitespace
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(lowerCaseString.charAt(i))) {
                finalString += lowerCaseString.charAt(i);
            }
        }
        return finalString;

    }

}

package Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author qtrain
 */
public class StringArrayOfWords {
    
    //instance variables
    private ArrayList<String> lines = new ArrayList<>();
    private static StringArrayOfWords arr = new StringArrayOfWords();//declare object

    public static void main(String[] args) throws Exception {
        
        String [] printArray = arr.readFile();//use an array to hold contents of arr.readFile for easy printing
        System.out.println(Arrays.toString(printArray));//Arrays.toString will print the contents of an Array

    }

   //method to read a file and call on object 
   public String [] readFile() throws Exception{  
        
        //display a gui window to choose a file to read in
        JOptionPane.showMessageDialog(null, "Please choose a question file");        
        JFileChooser input = new JFileChooser();
        int a = input.showOpenDialog(null);
        String file = "";
        if (a == JFileChooser.APPROVE_OPTION) {
            File selectedFile = input.getSelectedFile();
            file = selectedFile.getPath();
        }
        
        //use file input to read in line one at a time
        FileInputStream fstream = new FileInputStream(file);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
         //convert ArrayList to array
         String[] arr = lines.toArray(new String[lines.size()]);
         return arr;
    }
}

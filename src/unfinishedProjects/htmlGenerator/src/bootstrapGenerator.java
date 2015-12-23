import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by qtrain on 3/12/15.
 */
public class bootstrapGenerator implements Serializable{

    /*
        1. read input from file
        2. have to delimit somehow
        3. start with:
                       <div id="page-content-wrapper">
                         <div class="container-fluid">
                           <div class="col-xs-6 col-md-4">V
        4. when delimiter is found end with:
                           </div>
                         </div>
                       </div>
     */

    public static ArrayList<String> readLines() throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        showMessageDialog(null, "Please choose a file");
        JFileChooser input = new JFileChooser();
        int a = input.showOpenDialog(null);
        String file = "";

        if (a == JFileChooser.APPROVE_OPTION) {
            File selectedFile = input.getSelectedFile();
            file = selectedFile.getPath();
        }

        //use file input to read in line one at a time
        Scanner read = new Scanner(new File(file));
        read.useDelimiter("&&&");
        while(read.hasNext()){
            lines.add(read.next());
        }
        return lines;
    }

    public static ArrayList<String> editFile(){
        ArrayList<String> newList = new ArrayList<String>();
        try {
            for(String item:readLines()){
                newList.addAll(appendText());
                newList.add(item);
                newList.addAll(prependText());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newList;
    }

    public static ArrayList<String> appendText () {

        ArrayList<String> append = new ArrayList<>();
        append.add("<!-------------- Section ------------------>");
        append.add("<div class=\"container-fluid\">");
        append.add("  <div id=\"row\">");
        append.add("    <div class=\"col-md-4\">");
        append.add("      <h5 id=\"\"></h5>");
        append.add("        <pre><code class=\"language-java\">\n");
        return append;
    }

    public static ArrayList<String> prependText(){
        ArrayList<String> prepend = new ArrayList<>();
        prepend.add("      </pre></code>");
        prepend.add("    </div>");
        prepend.add("  </div>");
        prepend.add("</div>");
        prepend.add("<!--------------------end------------------>");
        prepend.add("");
        return prepend;
    }

    public static void writeFile(ArrayList<String> formalFinalArray) throws IOException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("index.txt"));
        for (String n : formalFinalArray)
            pw.println(n);
            pw.close();
            showMessageDialog(null, "File is written");
        }

    public static void main(String[] args) throws IOException {
        writeFile(editFile());
    }

}

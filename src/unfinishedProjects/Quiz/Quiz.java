package unfinishedProjects.Quiz;

//assigns package name
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Quiz //start Quiz class 
{

    String question;  //initializes question string  
    String answer;  //initializes answer string  
    int correct = 0, number;  //initializes scoring variables 
    Quiz[] quizBank = new Quiz[7];  //initializes quizBank array  
    List<Quiz> quizList = Arrays.asList(quizBank);  //sets the array as a list 
    List<String> lines = new ArrayList<String>();
    List<String> qlines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        Quiz bank = new Quiz();  //creates new Quiz object 
        bank.bankList();  //assigns name of portion of program to build the collection of questions and answers 
        bank.askQuestion();  //assigns name of portion of program to ask the questions 
    }  //end main 

    public void bankList() throws Exception {
        JOptionPane.showMessageDialog(null, "Please choose a question file");

        //get Question File
        JFileChooser input = new JFileChooser();
        int status = input.showOpenDialog(null);
        String questionFile = "";
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = input.getSelectedFile();
            questionFile = selectedFile.getPath();
        }

        JOptionPane.showMessageDialog(null, "Please choose an answer file");
        //get answer file
        String answerFile = "";
        int status2 = input.showOpenDialog(null);
        if(status2==JFileChooser.APPROVE_OPTION){
            File selectedFile = input.getSelectedFile();
            answerFile=selectedFile.getPath();

        }

        //use to read in one at a time
        FileInputStream qStream = new FileInputStream(answerFile);
        DataInputStream q = new DataInputStream(qStream);
        BufferedReader li = new BufferedReader(new InputStreamReader(q));
        String qLine;
        while ((qLine = li.readLine()) != null) {
            qlines.add(qLine);
            //System.out.println(qLine);
        }


        String[] arr = lines.toArray(new String[lines.size()]);
        String[] qArr = qlines.toArray(new String[qlines.size()]);

        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(qArr));

        for (int i = 0; i < quizBank.length; i++) {
            quizBank[i] = new Quiz();
            quizBank[i].question = qArr[i];
            quizBank[i].answer = arr[i];

        }
        Collections.shuffle(quizList);  //shuffles the list 
    }  //end of bankList 

    public void askQuestion() {
        Scanner input = new Scanner(System.in);  //prepare to read input from keyboard 
        System.out.println("********************************");  //prints heading top border 2
        System.out.println(" Welcome to my Quiz Application");  //prints heading 
        System.out.println("********************************");  //prints heading bottom border 

        for (number = 1; number < quizList.size(); number++) {
            System.out.printf("%d. %s?%n", number, quizBank[number].question);  //print Quiz[] quizBank = new Quiz[7];  //initializes quizBank array  
            List<Quiz> quizList = Arrays.asList(quizBank);  //sets question 
            String entered = input.nextLine();  //read input 

            if (entered.compareTo(quizBank[number].answer) == 0) {
                System.out.println("*** Correct! ***");  //prints correct response 2

                correct = correct + 1;  //counts number of correct answers 0
            } //end of if 
            else {
                System.out.println("--- Incorrect! ---");  //print the incorrect response m
                System.out.println(quizBank[number].answer);
            }
        }  //end of counter for loop 

        System.out.println("*******************");  //prints footer top border 
        System.out.printf(" Your score is %d/%d%n", correct, number - 1);  //prints results 
        System.out.println("*******************");  //prints footer bottom border 
    }  //end of askQuestion 

    public void checkAnswer() {
    }

}  //end public class  

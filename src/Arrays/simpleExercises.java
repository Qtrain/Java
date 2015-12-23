package Arrays;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qtrain
 */
public class simpleExercises {

    public static void main(String[] args) {

        /**
         * Write a method to print numbers 1 through 100 and tell whic ones are
         * divisible by two and four
         */
//        int[] numbers = new int[101];
//
//        for (int i = 0; i < 101; i++) {
//            numbers[i] = i;
//
//            System.out.println(numbers[i]);
//
//            if (numbers[i] % 2 == 0) {
//                System.out.println("divisible by 2");
//                if (numbers[i] % 5 == 0) {
//                    System.out.println("divisible by 5");
//                }
//            }
//        }

        /**
         * Write a method to generate unique randome integers in a list how do I
         * print out the values?
         */
//        List<Integer> random = new ArrayList<>(8);
//        System.out.println("Print out values of list");
//
//        for (int i = 0; i < random.size(); i++) {
//            random.add((int) ((Math.random() * 10) + 1));
//
//            System.out.println((random.get(i)).toString());
//        }
//        Collections.shuffle(random);
//
//        System.out.println(random.toString());
        /**
         * Fizz/Buzz print a number 1 to 100 replacing numbers divisible by both
         * 3 and 5 by fizzBuzz divisible by 3 fizz and divisible by 5 buzz
         */
//        int[] fizzBuzz = new int[100];
//        
//        for (int i = 0; i < fizzBuzz.length; i++) {
//            fizzBuzz[i] = i + 1;
//            if (fizzBuzz[i] % 3 == 0) {
//                System.out.print(fizzBuzz[i] + " fizz ");
//            }
//            if (fizzBuzz[i] % 5 == 0) {
//                System.out.print(fizzBuzz[i] + " buzz ");
//            }
//            if ((fizzBuzz[i] % 3 == 0 && fizzBuzz[i] % 5 == 0)) {
//                System.out.print(fizzBuzz[i] + " FizzBuzz ");
//            }
//            if ((!(fizzBuzz[i] % 3 == 0 || fizzBuzz[i] % 5 == 0))) {
//                System.out.println(fizzBuzz[i]);
//            }
//
//        }
//        System.out.println(Arrays.toString(fizzBuzz));
//        int num = 32821;
//        int sum = 0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);
//    }
              String line = "Andy";
            String score1 = "200";
            String score2 = "250";
            String score3 = "400";

        String [] studentList = new String[4];
            studentList[0]=line;
            studentList[1]=score1;
            studentList[2]=score2;
            studentList[3]=score3;
        for (int i=0; i< 4;i++){
            System.out.printf("%30s %10s %10s %10s\n", studentList[0] + ":" + studentList[1] + ":" + studentList[2] + ":" + studentList[3]);
        }

}
    }


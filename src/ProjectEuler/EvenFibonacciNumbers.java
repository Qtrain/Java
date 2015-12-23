package ProjectEuler;

/**
 * Created by macbook on 12/23/15.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fibonacci(40));

    }

    public static int fibonacci(int n) {
        int sum = 0;
        int tmp = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            tmp = fibonacci(n - 1) + fibonacci(n - 2);
            if(tmp%2 == 0){
                sum += tmp;
            }
            return sum;
        }


    }

}

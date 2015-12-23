package ProjectEuler;

/**
 * Created by macbook on 12/5/15.
 */
public class multiplesOf3and5 {
    public static void main(String[] args) {
        System.out.println(findMultiples(1000));
    }

    public static int findMultiples(int input) {
        int sum = 0;
        for(int i=0; i<input; i++){
           if(i%3==0 || i%5==0){
               sum += i;
           }
        }
        return sum;
    }
}

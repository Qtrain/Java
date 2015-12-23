package SedgewickIntro;

/**
 * Created by macbook on 12/12/15.
 */
public class GCD {

    public static void main(String[] args) {

        int p = 6;
        int q = 8;

        System.out.println(findGCD(p, q));
    }

    public static int findGCD(int p, int q){
        if(q==0){
            return p;
        }
        else{
            return findGCD(q, p % q);
        }

    }
}

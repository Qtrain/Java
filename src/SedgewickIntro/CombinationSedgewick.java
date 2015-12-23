package SedgewickIntro;

/**
 * Created by macbook on 12/12/15.
 */
public class CombinationSedgewick {

    // alternate implementation
    public static void comb2(String s) throws InterruptedException {
        comb2(" ", s);
    }

    private static void comb2(String prefix, String s) throws InterruptedException {
        System.out.println(prefix);
        for (int i = 0; i < s.length(); i++) {
            comb2(prefix + s.charAt(i), s.substring(i + 1));
            Thread.sleep(3000);
        }
    }

    // read in N from command line, and print all subsets among N elements
    public static void main(String[] args) throws InterruptedException {
        int N = 4;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, N);

        // using second implementation
        comb2(elements);
        System.out.println();
    }

}


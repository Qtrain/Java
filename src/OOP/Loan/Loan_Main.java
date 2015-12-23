package OOP.Loan;

/**
 * Created by macbook on 9/13/15.
 */
public class Loan_Main {

    public static void main(String[] args) {
        Loan collegLoan = new Loan(.19, 5, 5000);

        collegLoan.getMonthlyPayment();
    }
}

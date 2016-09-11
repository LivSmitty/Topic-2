import java.util.Date;

/**
 * Created by scott_000 on 9/10/2016.
 */
public class Account {

    //declare variables
    public int id = 0;
    public double balance = 0;
    public double annualInterestRate = 0;
    public double deposit;
    public double withdraw;
    private java.util.Date dateCreated;


    Account() {

    }

    Account(int x, double y) {
        id = x;
        balance = y;
    }

    double getMonthlyInterestRate(double y) {
        annualInterestRate = y;
        return (annualInterestRate/100)/12;
    }
    double getMonthlyInterest(double i) {
        return balance * i;
    }
    double getDeposit(int d) {
        balance = balance + d;
        return balance;
    }
    double getWithdraw(int w) {
        balance = balance - w;
        return balance;
    }
    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

}

/**
 * Created by scott_000 on 9/10/2016.
 */
public class TestAccount {
    public static void main(String[] args) {
        //Create account

        Account account1 = new Account(1122, 20000);

        double monthlyInterest = account1.getMonthlyInterestRate(4.5);
        account1.getWithdraw(2500);

        account1.getDeposit(3000);
        account1.getMonthlyInterest(monthlyInterest);
        //account1.getDateCreated();


        System.out.println("Account Balance:  " + account1.balance);
        System.out.println("Monthly Interest: " + (monthlyInterest * account1.balance));
        System.out.println("Transaction Date: " + account1.getDateCreated());



    }
}


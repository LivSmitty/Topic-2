/**
 * Created by scott_000 on 9/10/2016.
 */
public class Stock {
    public static void main(String[] args) {

        Stock stock1 = new Stock("Oracle Corporation", "ORCL");

        System.out.println("The percentage change in ORCL stock is: " + stock1.getChangePercent(34.5, 34.35));

    }

    String name;
    String symbol;
    Double oldPrice;
    Double newPrice;


    Stock(String n, String s) {
        name = n;
        symbol = s;
    }

    double getChangePercent(double oldPrice, double newPrice) {
        return (newPrice - oldPrice)/oldPrice;
    }


}




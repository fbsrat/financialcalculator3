import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //accepts the total amount of loan from user
        System.out.println("please enter the deposit number");
        double principal = read.nextDouble();
        System.out.println("please enter the annual interest rate"); //accepts the amount of interest in percentage
        double interestRate = read.nextDouble();
        System.out.println("  please enter the number of years , thank you ");     //accepts the lengh of loan in year
        int years = read.nextInt();
        calculateFutureValue(principal, interestRate, years);
    }


    public static void calculateFutureValue(double principal, double interestRate, double years) {
        double r = interestRate / 100;     // calculates interest rate
        double d= 365;    // number of days in year
        double totalNumberOfDays = d *years;   // calculates number of days in a given year
        double a =r/d;// calculates daily interest rate
        double futureValue =principal* Math.pow(1 +a, totalNumberOfDays); //

        double totalInterest = futureValue - principal;
        System.out.printf("A deposit of $%,.0f in a compound interest that earns %.2f%% interest and matures in %.0f years"+
                " your compound interest 's  ending balance will be $%,.2f and you would have earned $%,.2f in interest%n",principal,interestRate,years, futureValue ,totalInterest);
    }
}
package ControlFlow;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestRates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount");
        double userAmount = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the interest");
        double userInterest = scan1.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter for how many years");
        int year= scan2.nextInt();
        
        DecimalFormat df = new DecimalFormat("#.####");


        for (double interest= userInterest; interest <= 10.0; interest+=0.25){
            double interestAmount = calculateInterest(userAmount, interest, year);
            System.out.println("for the "+ df.format(userAmount) + " cash the bank will give you " + interest + " interest and it makes "
            + df.format(interestAmount) +" income for a " + year +" year" );

            userAmount +=interestAmount;
        }


        scan.close();
        scan1.close();
        scan2.close();

        
    }
    public static double calculateInterest(double amount, double interest, int year){

        return (double) (amount * (interest/100) * year);
    }
    
}

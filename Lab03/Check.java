/////////////////////////
//Alek Sajewski
//9/11/15
//CSE2
//This program will calculate the cost of a bill, the necessary tip to not be a jerk, and how it will be divided

import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        //Readouts and variables requesting inputs
        System.out.print("Enter the bill's price in the form xx.xx: $");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the tip percentage you wish to pay as a whole number: ");
        double tipPercent = myScanner.nextDouble();
        tipPercent=tipPercent/100;
        System.out.print("Enter the number of people who dined and aren't dashing: ");
        int reasonablePeople=myScanner.nextInt();
        //Calculations
        checkCost=checkCost*(tipPercent+1);
        checkCost=checkCost/reasonablePeople;
        //Readout
        System.out.println(String.format("%.2f","Each person must pay $"+checkCost));
        
        
    }
    
}

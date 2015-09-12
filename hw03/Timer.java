////////////////////////////////////////////////////////
//Alek Sajewski
//9/11/15
//CSE2
//This program will take the expected time of an event, the current time, and display the amount of time between them

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
         Scanner myScanner = new Scanner( System.in );
         //Input variables
         System.out.print("What time is it currently?");
         int currentTime= myScanner.nextInt();
         System.out.print("What time are you going to eat?");
         int dinnerTime= myScanner.nextInt();
         //Calculation variables
         int timeBetween=dinnerTime-currentTime;
         int hour = Integer.parseInt(Integer.toString(timeBetween).substring(0, 1));//this divides the total time readout into individual hours
         int minute= Integer.parseInt(Integer.toString(timeBetween).substring(1, 3));//and minutes
         //Output
         System.out.println("You have "+hour+" hours and "+minute+" minutes until dinner.");
        
    }
}

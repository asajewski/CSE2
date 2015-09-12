/////////////////////////////////////////////////////////////////////////////////
//Alek Sajewski
//9/12/15
//CSE2
//This program will take the proportions of a block's sides and readout the total volume and surface area

import java.util.Scanner;

public class Block{
    public static void main(String [] args){
        Scanner myScanner = new Scanner( System.in);
        //Input Variables
        System.out.print("Enter the length of the block: ");
        double length= myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width= myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height= myScanner.nextDouble();
        //Calculations
        double volume=length*width*height;
        double surfaceArea=(length*width*2)+(length*height*2)+(height*width*2);
        //Output
        System.out.println("The volume of the block with dimensions "+height+" by "+length+" by "+width+" is "+volume);
        System.out.println("The surface area of the block is "+surfaceArea);
        
        
    }
}
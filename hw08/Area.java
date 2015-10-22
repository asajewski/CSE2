//////////////////////////////////////////////////
//Alek Sajewski
//10/18/2015
//CSE2
//This program will give the area of a shape with the input of what type of shape you want and the appropriate dimensions

import java.util.Scanner;

public class Area{
    public static void main(String [] args){
        //declaring variables
        Scanner myScanner = new Scanner(System.in);
        String rectangle;
        String triangle;
        String circle;
        double length=0;
        double width=0;
        double height=0;
        double base=0;
        double radius=0;
        //shape inputs
        System.out.println("What is the shape you desire?");
        String shape = myScanner.next();
        //determing method choice
        if (shape.equals("rectangle")){
            double area= rectangle(length, height);
        }
        else if (shape.equals("triangle")){
            double area =triangle(base, height);
        }
        else if (shape.equals("circle")){
            double area = circle(radius);
        }
        //error message
        else if (shape != "rectangle" || shape != "triangle" || shape!= "circle") {
            System.out.println("Give me a real shape!");
        }
    }
    //method for finding rectangle area
    public static double rectangle(double length, double height){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("What is the length of your shape?");
        length = myScanner.nextDouble();
        System.out.println("What is the height of your shape:");
        height = myScanner.nextDouble();
        double rectArea = length * height;
        System.out.println("Your area is " + rectArea);
        return rectArea;
    }
    //triangle area method
    public static double triangle(double base, double height){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("What is the base length of your shape?");
        base = myScanner.nextDouble();
        System.out.println("What is the height of your shape?");
        height = myScanner.nextDouble();
        double triArea = .5 * base * height;
        System.out.println("Your area is " + triArea);
        return triArea;
    }
    //circle area method
    public static double circle(double radius){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the radius of your shape?");
        radius= myScanner.nextDouble();
        double circArea = (3.14159)*(radius*radius);
        System.out.println("Your area is " + circArea);
        return circArea;
    }
}
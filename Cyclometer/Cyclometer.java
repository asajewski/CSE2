////////////////////////////////////////////////
//Alek Sajewski
//9/4/2015
//CSE2
//The following program will take the time and number of wheel rotations for a trip and give the distance traveled

public class Cyclometer {
    public static void main(String [] args) {
        //Relevant Variables
        int timetakentrip1=480; //time of trip in seconds
        int timetakentrip2=3220;
        int rotationstrip1=1561; //wheel rotations during trip
        int rotationstrip2=9037;
        double wheelradius=13.5;//wheel radius in inches
        double tirelength, distanceTrip1, distanceTrip2, totalDistance;
        //measurement variables
        double pi=3.14159;
        int feetpermile= 5280;
        int inchesperfoot=12;
        int secondsperminute=60;
        //Read outs of relevant variable data
        System.out.println("Trip one was "+(timetakentrip1/secondsperminute)+" minutes long, while the wheel spun "+rotationstrip1+" times.");
	    System.out.println("Trip two was "+(timetakentrip2/secondsperminute)+" minutes long, while the wheel spun "+rotationstrip2+" counts.");
        //Calculations to change input data into output data
        tirelength=2*wheelradius*pi;
        distanceTrip1=((tirelength/12)*rotationstrip1)/feetpermile;
        distanceTrip2=((tirelength/12)*rotationstrip2)/feetpermile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Read outs of outut data
        System.out.println("Trip one was for a distance of "+(distanceTrip1+" miles."));
        System.out.println("Trip two was for a distance of "+(distanceTrip2+" miles."));
        System.out.println("The total distance traveled is "+totalDistance+" miles.");
        

    }
}
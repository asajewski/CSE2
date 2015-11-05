///Alek Sajewski
///CSE2
///11/3/2015
///This program will figure out how 

//tools for the program
import java.lang.Math;
import java.util.Scanner;

public class Shuffling{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    	//suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        //array declarations
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
    public static void printArray(String[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    
    public static void shuffle(String[] list) {
        String temp;
        for (int i = 0; i < 52; i++) {
            int randNum = 0 + (int)(Math.random() * 51);
            temp = list[randNum];
            list[randNum] = list[1];
            list[1] = temp;
        }
        System.out.println("\nShuffled");
    }
    
    public static String[] randomizeHand(String[] list) {
        String temp;
        String[] alreadyUsed = new String[5];
        for (int i = 0; i < alreadyUsed.length; i++)
            alreadyUsed[i] = "";
        for (int i = 0; i < list.length; i++) {
            int randNum = 0 + (int)(Math.random() * list.length-1);
            boolean run = true;
            while (run) {
                for (int j = 0; j < alreadyUsed.length; j++) {
                    if (alreadyUsed[j].equals(list[randNum]))
                        run = true;
                }
                if (!run) {
                    run = true;
                    randNum = 0 + (int)(Math.random() * list.length-1);
                }
            }
            temp = list[randNum];
            list[randNum] = list[1];
            list[1] = temp;/////////
        }
        System.out.println("\nRandomized Hand");
        return alreadyUsed;
    }
}


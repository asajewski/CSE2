//////////////
//Alek Sajewski
//10/20/15
//CSE2
//Determines whether a string is all letters or has other types of characters

import java.util.Scanner;

public class StringAnalysis{
    //Main method 
    public static void main(String [] args){
        //declaring variables
        Scanner myScanner = new Scanner(System.in);
        String sentence;
        String phrase;
        int intStart=0;
        int intEnd=0;
        //requests for string inputs
        System.out.println("What is your sentence?");
        sentence = myScanner.next();
        System.out.println("Do you want to look at all or some of the phrase?");
        phrase = myScanner.next();
        //determining which method will be used
            if (phrase.equals("some")){ 
                //inputs for shortening of string
                System.out.println("What is the number of the letter you first require?");
                    intStart= (myScanner.nextInt()-1);
                System.out.println("What is the number of last letter you require?");
                    intEnd=myScanner.nextInt();
                    //read out
                if (character(sentence, intStart, intEnd)){
                    System.out.println("All the stuff is letters");
                }
                else {
                    System.out.println("All the stuff isn't letters");
                }
            }
            else if (phrase.equals("all")){
                //readout
                if (character(sentence)){
                    System.out.println("All the stuff is letters");
                }
                else {
                    System.out.println("All the stuff isn't letters");
                }
            }
            //error message
            else {
                System.out.println("Error: Answer some or all. Try again.");
            }
    }
    //method for determining string letter exclusivity in a shortened string
     public static boolean character(String sentence, int intStart, int intEnd){
         if (intEnd==(sentence.length())){
            String subDom= sentence.substring(intStart);System.out.println(subDom);
             for (int i = 0; i < sentence.substring(intStart).length(); i++) {
             if (!Character.isLetter(sentence.charAt(i)))
                return false;
             }
         return true;
         }
        else {
         String subDom = sentence.substring(intStart,intEnd); System.out.println(subDom);
         for (int i = 0; i < sentence.substring(intStart,intEnd).length(); i++) {
             if (!Character.isLetter(sentence.charAt(i)))
                return false;
     }
     }
      return true;}
      //letter exclusivity in an entire string
     public static boolean character(String sentence){
         for (int i = 0; i < sentence.length(); i++) {
             if (!Character.isLetter(sentence.charAt(i)))
                return false;
         }
         return true;
     }
     
}


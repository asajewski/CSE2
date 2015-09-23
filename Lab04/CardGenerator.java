/////////////
//Alek Sajewski
//9/18/15
//CSE2
//This program will find a random card in a deck

import java.util.Random;

public class CardGenerator {
    public static void main(String[] args){
        //Random number generator
        Random randomGenerator= new Random();
        //basic variables
        String suit="Test";
        String cardDisplay="Test";
        int cardPick = (int)(Math.random()*52)+1;
        if (cardPick<14){
            suit= "Diamonds";
            }
            else if (cardPick<27 && cardPick>13){ 
            suit= "Clubs";
            cardPick=cardPick / 2;
            }
            else if (cardPick<40 && cardPick>26){
            suit= "Hearts";
            cardPick=cardPick / 3;
            }
            else if (39<cardPick){
            suit= "Spades";
            cardPick=cardPick / 4;
            }
        if (cardPick == 1){
            cardDisplay= "Ace";
        }
            else if (cardPick==11){
            cardDisplay= "Jack";
        }
            else if (cardPick==12){
            cardDisplay= "Queen";
        }
            else if (cardPick==13){
            cardDisplay= "King";
        }
            else cardDisplay=Integer.toString(cardPick);
        
        System.out.println("You picked the " + cardDisplay + " of " + suit);
        
        }
}
//////////////////////////////
//Alek Sajewski
//9/21/15
//CSE2
//This program will determine if you have any kind of relevant combination 

import java.util.Random;

public class PokerHandCheck {
    public static void main(String[] args){
        //Random number generator
        Random randomGenerator= new Random();
//Card #1
        //basic variables
        String suit1="Test";
        String cardDisplay1="Test";
        int cardPick1 = (int)(Math.random()*52)+1;
        //Logic for determining suit and fixing higher numbers into numbers that make sense
        if (cardPick1<14){
            suit1= "Diamonds";
            }
            else if (cardPick1<27 && cardPick1>13){ 
            suit1= "Clubs";
            cardPick1=cardPick1 / 2;
            }
            else if (cardPick1<40 && cardPick1>26){
            suit1= "Hearts";
            cardPick1=cardPick1 / 3;
            }
            else if (39<cardPick1){
            suit1= "Spades";
            cardPick1=cardPick1 / 4;
            }
        //Adjustment for numbers that ought to be named cards
        if (cardPick1 == 1){
            cardDisplay1= "Ace";
        }
            else if (cardPick1==11){
            cardDisplay1= "Jack";
        }
            else if (cardPick1==12){
            cardDisplay1= "Queen";
        }
            else if (cardPick1==13){
            cardDisplay1= "King";
        }
            else cardDisplay1=Integer.toString(cardPick1);
        
        System.out.println("You picked the " + cardDisplay1 + " of " + suit1);
//Card #2
          String suit2="Test";
        String cardDisplay2="Test";
        int cardPick2 = (int)(Math.random()*52)+1;
        //Logic for determining suit and fixing higher numbers into numbers that make sense
        if (cardPick2<14){
            suit2= "Diamonds";
            }
            else if (cardPick2<27 && cardPick2>13){ 
            suit2= "Clubs";
            cardPick2=cardPick2 / 2;
            }
            else if (cardPick2<40 && cardPick2>26){
            suit2= "Hearts";
            cardPick2=cardPick2 / 3;
            }
            else if (39<cardPick2){
            suit2= "Spades";
            cardPick2=cardPick2 / 4;
            }
        //Adjustment for numbers that ought to be named cards
        if (cardPick2 == 1){
            cardDisplay2= "Ace";
        }
            else if (cardPick2==11){
            cardDisplay2= "Jack";
        }
            else if (cardPick2==12){
            cardDisplay2= "Queen";
        }
            else if (cardPick2==13){
            cardDisplay2= "King";
        }
            else cardDisplay2=Integer.toString(cardPick2);
        
        System.out.println("You picked the " + cardDisplay2 + " of " + suit2);
//Card #3
          String suit3="Test";
        String cardDisplay3="Test";
        int cardPick3 = (int)(Math.random()*52)+1;
        //Logic for determining suit and fixing higher numbers into numbers that make sense
        if (cardPick3<14){
            suit3= "Diamonds";
            }
            else if (cardPick3<27 && cardPick3>13){ 
            suit3= "Clubs";
            cardPick3=cardPick3 / 2;
            }
            else if (cardPick3<40 && cardPick3>26){
            suit3= "Hearts";
            cardPick3=cardPick3 / 3;
            }
            else if (39<cardPick3){
            suit3= "Spades";
            cardPick3=cardPick3 / 4;
            }
        //Adjustment for numbers that ought to be named cards
        if (cardPick3 == 1){
            cardDisplay3= "Ace";
        }
            else if (cardPick3==11){
            cardDisplay3= "Jack";
        }
            else if (cardPick3==12){
            cardDisplay3= "Queen";
        }
            else if (cardPick3==13){
            cardDisplay3= "King";
        }
            else cardDisplay3=Integer.toString(cardPick3);
        
        System.out.println("You picked the " + cardDisplay3 + " of " + suit3);
//Card #4
          String suit4="Test";
        String cardDisplay4="Test";
        int cardPick4 = (int)(Math.random()*52)+1;
        //Logic for determining suit and fixing higher numbers into numbers that make sense
        if (cardPick4<14){
            suit4= "Diamonds";
            }
            else if (cardPick4<27 && cardPick4>13){ 
            suit4= "Clubs";
            cardPick4=cardPick4 / 2;
            }
            else if (cardPick4<40 && cardPick4>26){
            suit4= "Hearts";
            cardPick4=cardPick4 / 3;
            }
            else if (39<cardPick4){
            suit4= "Spades";
            cardPick4=cardPick4 / 4;
            }
        //Adjustment for numbers that ought to be named cards
        if (cardPick4 == 1){
            cardDisplay4= "Ace";
        }
            else if (cardPick4==11){
            cardDisplay4= "Jack";
        }
            else if (cardPick4==12){
            cardDisplay4= "Queen";
        }
            else if (cardPick4==13){
            cardDisplay4= "King";
        }
            else cardDisplay4=Integer.toString(cardPick4);
        
        System.out.println("You picked the " + cardDisplay4 + " of " + suit4);
//Card #5
          String suit5="Test";
        String cardDisplay5="Test";
        int cardPick5 = (int)(Math.random()*52)+1;
        //Logic for determining suit and fixing higher numbers into numbers that make sense
        if (cardPick5<14){
            suit5= "Diamonds";
            }
            else if (cardPick5<27 && cardPick5>13){ 
            suit5= "Clubs";
            cardPick5=cardPick5 / 2;
            }
            else if (cardPick5<40 && cardPick5>26){
            suit5= "Hearts";
            cardPick5=cardPick5 / 3;
            }
            else if (39<cardPick5){
            suit5= "Spades";
            cardPick5=cardPick5 / 4;
            }
        //Adjustment for numbers that ought to be named cards
        if (cardPick5 == 1){
            cardDisplay5= "Ace";
        }
            else if (cardPick5==11){
            cardDisplay5= "Jack";
        }
            else if (cardPick5==12){
            cardDisplay5= "Queen";
        }
            else if (cardPick5==13){
            cardDisplay5= "King";
        }
            else cardDisplay5=Integer.toString(cardPick5);
        
        System.out.println("You picked the " + cardDisplay5 + " of " + suit5);
        
//Logic to determine if any of the chosen cards will establish some type of hand
       String pokerNarrator= "There is only a high card.";
       boolean isThree = false;
       int numpair=0;
        if (cardPick1==cardPick2){
            numpair++;
            if (cardPick1 == cardPick3 || cardPick1 == cardPick4 || cardPick1 == cardPick5)
                isThree = true;
        }
        if (cardPick1==cardPick3){
            numpair++;
             if (cardPick1 == cardPick2 || cardPick1 == cardPick4 || cardPick1 == cardPick5)
                isThree = true;
        }
        if ( cardPick1==cardPick4){
            numpair++;
             if (cardPick1 == cardPick2 || cardPick1 == cardPick3 || cardPick1 == cardPick5)
                isThree = true;
        }
        if (cardPick1==cardPick5){
            numpair++;
             if (cardPick1 == cardPick2 || cardPick1 == cardPick3 || cardPick1 == cardPick4)
                isThree = true;
        }
        if (cardPick2==cardPick3){
            numpair++;
             if (cardPick2 == cardPick1 || cardPick2 == cardPick4 || cardPick2 == cardPick5)
                isThree = true;
        }
        if (cardPick2==cardPick4){
            numpair++;
             if (cardPick2 == cardPick1 || cardPick2 == cardPick3 || cardPick2 == cardPick5)
                isThree = true;
        }
        if (cardPick2==cardPick5){
            numpair++;
             if (cardPick2 == cardPick1 || cardPick2 == cardPick3 || cardPick1 == cardPick5)
                isThree = true;
        }
        if (cardPick3==cardPick4){
            numpair++;
             if (cardPick3 == cardPick1 || cardPick3 == cardPick2 || cardPick3 == cardPick5)
                isThree = true;
        }
        if (cardPick3==cardPick5){
            numpair++;
             if (cardPick3 == cardPick1 || cardPick3 == cardPick2 || cardPick3 == cardPick4)
                isThree = true;
        }
        if (cardPick4==cardPick5){
            numpair++;
             if (cardPick4 == cardPick1 || cardPick4 == cardPick2 || cardPick4 == cardPick3)
                isThree = true;
        }
        if (numpair == 1){
            pokerNarrator="There is one pair.";
        }
        if (numpair == 2){
            pokerNarrator="There are two pairs.";
        }
        if (isThree == true){
            pokerNarrator="There is three of a kind.";
        }
        System.out.println(pokerNarrator);
        }
}
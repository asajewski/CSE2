///////////////////////////////////////////////////////////////////////////////////
//Alek Sajewski
//9/8/15
//CSE2
//This program will work similar to how a cash register operates, it will calculate the individual and total cost, including tax, of various items

public class Arithmetic {
    public static void main(String[] args){
       
        int nSocks=3; //Number of sock pairs
        double sockCost$=2.58; //Cost per pair of socks
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; //Number of envelope boxes
        double envelopeCost$=3.25; //Cost per envelope
        double taxRate=.06;
        //variables for calculating various cost combinations
        double totalSockCost$; 
        double totalGlassCost$;
        double totalEnvelopeCost$;
        double totalCost$;
        double taxCost$;
        double totalCostwithTax$;
        //Basic item info
        System.out.println("Sock Pair");
        System.out.println(nSocks);
        System.out.println("$"+sockCost$);
        //Calculations
        totalSockCost$=nSocks*sockCost$;//cost before tax
        System.out.println( "Sock Cost before Tax: $"+ String.format("%.2f",totalSockCost$));
        taxCost$=totalSockCost$*taxRate;
        System.out.println("Sock Tax: $"+String.format("%.2f",taxCost$));
        totalCostwithTax$=totalSockCost$+taxCost$;//total cost with tax
        System.out.println("Sock Cost with Tax: $"+String.format("%.2f",totalCostwithTax$));
        totalSockCost$=totalSockCost$/nSocks;//individual cost with tax
        System.out.println("Cost per Unit: $"+totalSockCost$);
        //Basic item info
        System.out.println("Drinking Glass");
        System.out.println(nGlasses);
        System.out.println("$"+glassCost$);
        //Calculations
        totalGlassCost$=nGlasses*glassCost$;//cost before tax
        System.out.println( "Glass Cost before Tax: $"+ String.format("%.2f",totalGlassCost$));
        taxCost$=totalGlassCost$*taxRate;
        System.out.println("Glass Tax: $"+String.format("%.2f",taxCost$));
        totalCostwithTax$=totalGlassCost$+taxCost$;//total cost with tax
        System.out.println("Glass Cost with Tax: $"+String.format("%.2f",totalCostwithTax$));
        totalGlassCost$=totalGlassCost$/nGlasses;//individual cost with tax
        System.out.println("Cost per Unit: $"+totalGlassCost$);
        //Basic item info
        System.out.println("Box o' Envelopes");
        System.out.println(nEnvelopes);
        System.out.println("$"+envelopeCost$);
        //Calculations
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;//cost before tax
        System.out.println( "Envelope Cost before Tax: $"+ String.format("%.2f",totalEnvelopeCost$));
        taxCost$=totalEnvelopeCost$*taxRate;
        System.out.println("Envelope Tax: $"+String.format("%.2f",taxCost$));
        totalCostwithTax$=totalEnvelopeCost$+taxCost$;//total cost with tax
        System.out.println("Envelope Cost with Tax: $"+String.format("%.2f",totalCostwithTax$));
        totalEnvelopeCost$=totalEnvelopeCost$/nEnvelopes;//individual cost with tax
        System.out.println("Cost per Unit: $"+totalEnvelopeCost$);
        
    }
        
}
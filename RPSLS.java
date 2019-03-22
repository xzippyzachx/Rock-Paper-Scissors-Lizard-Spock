
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RPSLS {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		String input1;
		String input2;
		String inputName1 = "";
		String inputName2 = "";
		
		String[] endText = new String[60];
		
		int choice1 = 0;
		int choice2 = 0;
		
		String winner = "";
		
		Scanner scr = new Scanner(System.in);
		
		endText[21] = "Paper Covers Rock";
		endText[13] = "Rock Smashes Scissors";
		endText[32] = "Scissors Cut Paper";
		endText[42] = "Lizard Eats Paper";
		endText[14] = "Rock Crushes Lizard";
		endText[45] = "Lizard Poisons Spock";
		endText[34] = "Scissors Decapitate Lizard";
		endText[51] = "Spock Vaporizes Rock";
		endText[25] = "Paper Disproves Spock";
		endText[53] = "Spock Smashes Scissors";
		
		endText[12] = "Paper Covers Rock";
		endText[31] = "Rock Smashes Scissors";
		endText[23] = "Scissors Cut Paper";
		endText[24] = "Lizard Eats Paper";
		endText[41] = "Rock Crushes Lizard";
		endText[54] = "Lizard Poisons Spock";
		endText[43] = "Scissors Decapitate Lizard";
		endText[15] = "Spock Vaporizes Rock";
		endText[52] = "Paper Disproves Spock";
		endText[35] = "Spock Smashes Scissors";
		
		
		System.out.println("|ROCK PAPER SCISSORS LIZARD SPOCK|");
		System.out.println("");System.out.println("");
		
		TimeUnit.SECONDS.sleep(3);		
		
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		
		System.out.println("|Player 1| Choose Your WEAPON!");
		System.out.println("Rock(R) Paper(P) Scissors(S) Lizard(L) Spock(SP)");
				
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
				
		input1 = scr.nextLine();
		
		if(input1.equals("R"))			
			{inputName1 = "Rock"; 	choice1 = 1;}
		if(input1.equals("P"))
			{inputName1 = "Paper"; 	choice1 = 2;}
		if(input1.equals("S"))
			{inputName1 = "Scissors";choice1 = 3;}
		if(input1.equals("L"))
			{inputName1 = "Lizard"; choice1 = 4;}
		if(input1.equals("SP"))
			{inputName1 = "Spock"; 	choice1 = 5;}
		if(input1.equals("CU"))
			inputName1 = "HACKS";
		
		System.out.println("|Player 1| Choose " + inputName1 + " As There WEAPON!");
		
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		
		TimeUnit.SECONDS.sleep(3);			
		
		System.out.println("|Player 2| Choose Your WEAPON!");
		System.out.println("Rock(R) Paper(P) Scissors(S) Lizard(L) Spock(SP)");
				
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
				
		input2 = scr.nextLine();
		
		if(input2.equals("R"))
			{inputName2 = "Rock";	choice2 = 1;}
		if(input2.equals("P"))
			{inputName2 = "Paper";	choice2 = 2;}
		if(input2.equals("S"))
			{inputName2 = "Scissors";choice2 = 3;}
		if(input2.equals("L"))
			{inputName2 = "Lizard";	choice2 = 4;}
		if(input2.equals("SP"))
			{inputName2 = "Spock";	choice2 = 5;}
		if(input2.equals("CU"))
			inputName2 = "HACKS";
		
		System.out.println("|Player 2| Choose " + inputName2 + " As There WEAPON!");
		
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
	
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("BATTLE!...");
		
		System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
		
		TimeUnit.SECONDS.sleep(3);
		
		System.out.println("|Player 1| Choose " + inputName1 + " As There WEAPON!");
		System.out.println("");
		System.out.println("|Player 2| Choose " + inputName2 + " As There WEAPON!");
		System.out.println("");
		
		if((input1.equals("P") && input2.equals("R")) || (input1.equals("R") && input2.equals("S")) || (input1.equals("S") && input2.equals("P")) || (input1.equals("L") && input2.equals("P")) || (input1.equals("L") && input2.equals("SP")) || (input1.equals("R") && input2.equals("L")) || (input1.equals("S") && input2.equals("L")) || (input1.equals("SP") && input2.equals("R")) || (input1.equals("P") && input2.equals("SP")) || (input1.equals("SP") && input2.equals("S")))
			winner = "Player 1";
		
		if((input2.equals("P") && input1.equals("R")) || (input2.equals("R") && input1.equals("S")) || (input2.equals("S") && input1.equals("P")) || (input2.equals("L") && input1.equals("P")) || (input2.equals("L") && input1.equals("SP")) || (input2.equals("R") && input1.equals("L")) || (input2.equals("S") && input1.equals("L")) || (input2.equals("SP") && input1.equals("R")) || (input2.equals("P") && input1.equals("SP")) || (input2.equals("SP") && input1.equals("S")))
			winner = "Player 2";
		
		if(input1.equals(input2))
		{
			System.out.println("|Tie| The battle ends in an awqward silence!");
			
			System.out.println("");System.out.println("");System.out.println("");System.out.println("");System.out.println("");
			return;
		}
		
		if(input1.equals("CU"))
		{
			winner = "Player 1";			
			System.out.println("|" + winner + "| WINS!");			
			System.out.println("");			
			System.out.println("Campeau assends from above and deletes " + inputName2);
			
			System.out.println("");System.out.println("");System.out.println("");		
			return;
		}
		if(input2.equals("CU"))
		{
			winner = "Player 2";			
			System.out.println("|" + winner + "| WINS!");			
			System.out.println("");			
			System.out.println("Campeau assends from above and deletes " + inputName1);
			
			System.out.println("");System.out.println("");System.out.println("");	
			return;
		}
				
		System.out.println("|" + winner + "| WINS!");
		System.out.println("");	
		System.out.println(endText[Integer.valueOf(String.valueOf(choice1) + String.valueOf(choice2))]);
		
		System.out.println("");System.out.println("");System.out.println("");

	}
	
}

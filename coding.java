package utility;

import java.util.Scanner;
import utility.LoadProperties;
import utility.LoadRatePayer;


public class DisplayRatePayerAndProperty<Load> extends FunctionalDialog {
	private static final int LoadRatePayer= 1,
							LoadProperties= 2; 
	private static final int exit= 3;
	private static final int MAX_DETAILS_SHOWN = 3;
	private static final String MESSAGES = "What details you want to select? \n" +
											LoadRatePayer + ".Rate Payer \n" +
											LoadProperties + ".Property \n" +
											exit + ".Exit \n";
	private int details;


	public DisplayRatePayerAndProperty(Scanner console) {
		super(MAX_DETAILS_SHOWN, console);
		// TODO Auto-generated constructor stub
		System.out.println(MESSAGES);
	}
	
	protected void obtainInput(int i) {
		// TODO Auto-generated method stub
			switch(i) {
			case 0: 
				details = obtainInt(MAX_DETAILS_SHOWN, MESSAGES);
				break;
		
			}
		}
	private int obtainInt (int max, String message) {
		System.out.println(message);
		return validateInt(1, max);
	}
	private int validateInt(int min, int max) {
		int userInput;
		do {
			System.out.print("Enter a selection ("+min + "-" + max +"):");
			if (!getScanner().hasNextInt())
				userInput = max+1;
			else
				userInput = getScanner().nextInt();	
			
			if (userInput < min || userInput > max)
				System.out.println("Invalid choice.");
			
		} while (userInput < min || userInput > max);
		System.out.println();		// put a space before the next output	
		return userInput;
	}

	private Scanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void respondToInput() {
		// TODO Auto-generated method stub
		Load load = null;
		switch (details) 
		{
			case(LoadProperties):
				break;
			case(LoadRatePayer):
				break;
			case(exit):
				break;				
		}
	}
}


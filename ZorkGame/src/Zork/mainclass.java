package Zork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclass {
	
	static String InputString;
	static String[] InputStringArray;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		System.out.println("CONSOLE TESTING ENVIRONMENT\n");
		
		for(;;) {    // Main program loop
			try {
				getInputToInputString(">");
				InputStringArray = InputString.split(" ");
				
				/*
				 * Begins parsing commands
				 * Tests which command in first position of InputStringArray
				 * Then passes control to specialized function 
				 */
				switch(InputStringArray[0]) {
				
				case "q":
					continue;
				case "quit":
					System.exit(0);
					break;
					
				default:
					System.out.print("I beg your pardon?");
					break;
				}
				
			}
			catch(Exception e) {
				System.out.print("ERROR: Unhandled exception thrown\n");
			}
		}
	}
	
	public static void getInputToInputString(String text) throws IOException {
		System.out.print(text);
		InputString = reader.readLine();
	}
}

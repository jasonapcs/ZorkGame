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
				System
				InputStringArray = InputString.split(" ");
				
				/*
				 * Begins parsing commands
				 * Tests which command in first position of InputStringArray
				 * Then passes control to specialized function 
				 */
				switch(InputStringArray[0]) {
				
					
				default:
					System.out.print("Unrecognized command: \'" + 
				InputStringArray[0] + "\'\nTry using 'man' to get commands\n");
					break;
				}
				
			}
			catch(Exception e) {
				System.out.print("ERROR: Unhandled exception thrown\n");
			}
		}
	}
}

package Zork;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import asg.cliche.*;

public class mainclass {
	
	static String InputString;
	static String[] InputStringArray;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static location[] locations;
	
	static final String gameInfo = ""
			+ "(not) ZORK\n"
			+ "Not Copyrighted by Infocom, Inc.\n"
			+ "ZORK is a registered trademark of Infocom, Inc.\n"
			+ "My use of it should fall under fair use\n";
	
	@Command
	public void quit(){
		System.exit(0);
	}
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(gameInfo);
		
		ShellFactory.createConsoleShell("", "NotZork", new mainclass()).commandLoop();;
	}
	
	public static void getInputToInputString(String text) throws IOException {
		System.out.print(text);
		InputString = reader.readLine();
	}
}

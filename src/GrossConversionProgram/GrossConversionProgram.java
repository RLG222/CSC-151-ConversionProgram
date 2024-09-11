/* This is Robert Gross' 8th java program written on June 13th, 2023. The purpose of
 * this program is to take an input of meters by the user, and allow them to have it 
 * returned converted as kilometers, feet, or inches. The program will continue to
 * offer conversions until the user decides to quit with a 4th option. This will be 
 * achieved through the use of loops and methods.
 * kilometers = meters * .001
 * inches = meters * 39.37
 * feet = meters * 3.281
 */
package GrossConversionProgram; // package declaration

import java.util.Scanner; //insert scanner in order to be able to execute scanner commands

public class GrossConversionProgram { //class declaration

	
	
	public static void main(String[] args) { //main method
		
		
		Scanner scan = new Scanner(System.in); //Create Scanner to request info from user
		System.out.print("Please enter a distance in meters: "); //request meters from user
		double userMeters = scan.nextDouble();	//store meters from user as double
		
		while(userMeters < 0) { //when user answer is less than 0 
			System.out.print("Invalid answer. Please enter a positive value for meters: "); //request valid answer from user
			userMeters = scan.nextDouble();	//store meters from user
		}
		
		menu(); //display menu method
		System.out.print("Please enter your choice: "); //request choice from user
		int userChoice =  scan.nextInt(); //store choice as int
		
		while(userChoice != 4) { //when the menu choice isn't 4
			if(userChoice == 1) {
				showKilometers(userMeters); //when choice is 1 showKilometers
			} else if(userChoice == 2) {
					showInches(userMeters); //when choice is 2 showInches
			} else if(userChoice == 3) {
					showFeet(userMeters); //when choice is 3 showFeet
			} else {
					System.out.println("Please choose a valid option"); //when choice isnt 1-4 try again
			}
		menu(); // when menu choice isnt 4 show menu again
		System.out.print("Please enter your choice: "); //repeat choice option
		userChoice =  scan.nextInt(); //store new choice as int
		}
		System.out.println("\n\nBye!"); // when menu choice is 4 say goodbye and end loop
	}
		
	/*This method is used to display to the user their conversion options 
	 * 
	 */
	public static void menu() {
		System.out.println("1. Convert to kilometers\n2. Convert to inches\n"
				+ "3. Convert to feet\n4. Quit the program\n");
	}
	/* This method is used to convert the meters to kilometers, and display the original meters and the 
	 * converted unit to the console
	 */
	public static void showKilometers(double userMeters) {
		double convKilometers = userMeters * .001;
		System.out.println("\n\n" + userMeters +" Meters is " + convKilometers + " Kilometers.\n");
	}
	/* This method is used to convert the meters to inches, and display the original meters and the 
	 * converted unit to the console
	 */
	public static void showInches(double userMeters) {
		double convInches = userMeters * 39.37;
		System.out.println("\n\n" + userMeters +" Meters is " + convInches + " Inches.\n");
	}
	/* This method is used to convert the meters to feet, and display the original meters and the 
	 * converted unit to the console
	 */
	public static void showFeet(double userMeters) {
		double convFeet = userMeters * 3.281;
		System.out.println("\n\n" + userMeters +" Meters is " + convFeet + " Feet.\n");
	}
}

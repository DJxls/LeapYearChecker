import java.util.Scanner;

/** 
 * Write a program to check if a year is leap year or not.
 * @author Darren
 *
 */

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exit = false; 
		
		do { 
			System.out.println("Enter a year: ");
			Scanner scanner = new Scanner(System.in); 
			String input = scanner.nextLine(); 
			
			if(input.isEmpty()) {
				exit = true;
			}else {
				int year = Integer.parseInt(input);
				System.out.println(year%4 != 0 ? "Not a leapyear" : "Leapyear");
			}
			if(exit) {
				scanner.close();
			}
		}while(!exit); 
	}

}

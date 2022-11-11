
/**
 * Program:		LotteryTicketArrayList.java
 * Purpose:		Another demonstration of some of the features of an ArrayList object
 * 				except that this example demonstrates a somewhat practical application
 * 				of an ArrayList. The application is to allow a user to choose a set of
 * 				six lottery numbers as would be selected for a Lotto 649 ticket. 
 * 				The ArrayList object is used to hold the numbers as they are entered 
 * 				by the user by inserting them into the ArrayList such that the elements
 * 				in the ArrayList are always in ascending order. This technique also
 * 				allows us to avoid duplicate lottery numbers since the program loops
 * 				through the numbers that are already in the ArrayList looking for the 
 * 				correct position to insert the newest input, but if a duplicate value is 
 * 				encountered the program rejects the latest input and doesn't add it to
 * 				the ArrayList.
 * Author:		Rudra Patel(RP)
 * Date:			Nov. 8, 2022
 * 
 * Status:		Incomplete.
 */

import java.util.*; // Imports Scanner and ArrayList

public class LotteryTicketArrayList {

	public static void main(String[] args) {
		// Declare a lottery ticket constant
		final int NUMBERS_PER_TICKET = 6;

		// Create a Scanner for obtaining keyboard inputs
		Scanner input = new Scanner(System.in);

		// Display a title/explanation
		System.out.println("Choose your lucky lottery ticket numbers!\n");

		// Create an ArrayList object to hold all the ticket numbers
		ArrayList<Integer> lotteryNumbers = new ArrayList<Integer>();

		// Populate the ArrayList from user input, keeping the numbers in ascending
		// order
		int num;
		for (int n = 1; n <= NUMBERS_PER_TICKET; n++) {
			System.out.printf("%5d: ", n);
			num = input.nextInt();

			if (lotteryNumbers.size() == 0) {
				// This is the first number, so just add it to the ArrayList
				lotteryNumbers.add(num);
			} else {
				// Search through the existing numbers in the ArrayList to find the correct
				// place
				// to insert the number
				for (int i = 0; i < lotteryNumbers.size(); i++) {
					if (num == lotteryNumbers.get(i)) {
						// The number is already in the ArrayList - it's a duplicate value
						System.out.println("ERROR: THat number has already been chosen. Please choose another number!");
						n--; // Preparing to repeat the current loop iteration
						break;
					}
					// TO DO: Add num to the ArrayList at the correct position to keep everything in
					// ascending order
				}
			}
		}

		// TO DO: Print the lottery ticket numbers that are in the ArrayList

		// Close the Scanner
		input.close();

	} // end main

} // end class
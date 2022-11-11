
/**
 * Program:		CollegeNamesArrayList.java
 * Purpose:		Demonstrates how to create an ArrayList and how to populate, insert, append 
 * 				and delete elements of an ArrayList. 
 * Author:		Rudra patel (RP)
 * Date:			Nov. 8, 2022
 * 
 * Status:		Complete.
 */

import java.util.*;

public class CollegeNamesArrayList {

	public static void main(String[] args) {

		// Create a Scanner for obtaining keyboard inputs
		Scanner input = new Scanner(System.in);

		// Display a title/explanation
		System.out.println("List of Ontario Colleges\n");

		// Create an ArrayList object to hold college names
		ArrayList<String> collegeNames = new ArrayList<String>();

		// Display the size (length) or the ArrayList
		System.out.println("The empty ArrayList object contains " + collegeNames.size() + " elements.");

		// Populate the ArrayList with the names of some colleges
		collegeNames.add("Fanshawe");
		collegeNames.add("Conestoga");
		collegeNames.add("Lambton");
		collegeNames.add("St. Clair");
		collegeNames.add("Niagra");
		collegeNames.add("Mohawk");

		// Display the contents of the ArrayList
		System.out.println("\nHere are the initial " + collegeNames.size() + " elements in the ArrayList...");
		for (int i = 0; i < collegeNames.size(); i++) {
			System.out.println(collegeNames.get(i));
		}

		// Insert a college name after Fanshawe
		collegeNames.add(1, "Georgian");

		System.out.println(
				"\nHere are " + collegeNames.size() + " elements in the ArrayList after inserting Georgian ...");
		for (String college : collegeNames) {
			System.out.println(college);
		}

		// Replace Niagara with George Brown
		collegeNames.set(5, "George Brown");

		System.out
				.println("\nHere are " + collegeNames.size() + " elements in the ArrayList after replacing Niagara...");
		for (String college : collegeNames) {
			System.out.println(college);
		}

		// Remove "Lambton" using it's index
		collegeNames.remove(3);

		System.out.println("\nHere are " + collegeNames.size()
				+ " elements in the ArrayList after removing element at index 3 ...");
		for (String college : collegeNames) {
			System.out.println(college);
		}

		// Remove a user-selected college from the list using it's name
		System.out.print("\nEnter the name of a college to remove: ");
		String collegeToRemove = input.nextLine();
		if (collegeNames.remove(collegeToRemove)) {
			System.out.println("\nHere are " + collegeNames.size() + " elements in the ArrayList after removing "
					+ collegeToRemove + "...");
			for (String college : collegeNames) {
				System.out.println(college);
			}
		} else {
			System.out.println("The college \"" + collegeToRemove + "\" is not in the list.");
		}

		// Close the Scanner
		input.close();

	} // end main

} // end class
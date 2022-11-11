
/**
 * Program:			CarDealership.java
 * Purpose:			Demonstrates using a 2D array and parsing String data to numbers.
 * Author:			RUDRA PATEL(RP)
 * Date:			Nov. 4, 2022
 */

import java.text.DecimalFormat;
import java.util.*;

public class CarDealership {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declare constants
		final double HST_RATE = 0.13;
		final double DELIVERY_FEE = 1250;

		// Display a title/explanation
		System.out.println("Welcome to Downtown Fine Cars!\n");

		// Create 2D array of inventory
		String[][] inventory = {
				{ "Model", "List Price", "Quantity" },
				{ "2023 Toyota Corolla L6M", "19450", "5" },
				{ "2023 Toyota Corolla Hybrid", "25190", "2" },
				{ "2023 Toyota RAV4 LE FWD", "28590", "8" },
				{ "2023 Toyota RAV4 Prime SE AWD", "44990", "1" },
				{ "2023 Toyota Tundra 4x4 Crewmax SR5", "48080", "4" },
				{ "2023 Toyota Prius Technology AWD-E", "32490", "3" }
		};

		// Display the inventory in rows and columns
		System.out.println("Here are the vehicles we have in stock...\n");

		// Each iteration of this outer loop prints one row
		for (int r = 0; r < inventory.length; r++) {
			// First column is generated (not from the array)
			if (r == 0) {
				// Just display a '#' as the first column header
				System.out.print("   #  ");
			} else {
				// Display the row number in the first column
				System.out.printf("%4d. ", r);
			}
			// Remaining columns are from the array
			for (int c = 0; c < inventory[r].length; c++) {
				if (c == 0) {
					// Format the vehicle model in a left-justified field of 40 characters
					System.out.printf("%-40s", inventory[r][c]);
				} else {
					// Format all other fields in a right-justified field of 10 characters
					System.out.printf("%10s", inventory[r][c]);
				}
			} // end inner for
			System.out.println(); // line break
		} // end outer for

		// Calculate and display the total number of vehicles
		int total = 0;
		for (int r = 1; r < inventory.length; r++) {
			// Convert quantity to an integer
			int count = Integer.parseInt(inventory[r][2]);

			// Add quantity to the total
			total += count;
		}
		System.out.println("\nTotal vehicles in stock: " + total);

		// Ask the user to select a vehicle and validate
		int choice;
		boolean validChoice;
		System.out.print("Please select a vehicle by number: ");
		do {
			choice = input.nextInt();
			validChoice = choice > 0 && choice < inventory.length;
			if (!validChoice) {
				System.out.print("Invalid choice. Enter another vehicle number: ");
			}
		} while (!validChoice);

		// Display the model and price of the vehicle
		System.out.printf("\nYou selected the %s.\n", inventory[choice][0]);

		double price = Double.parseDouble(inventory[choice][1]);
		DecimalFormat dollarsFormat = new DecimalFormat("$#,##0");
		System.out.printf("It sells for %s.\n", dollarsFormat.format(price));

		double fullPrice = (price + DELIVERY_FEE) * (1 + HST_RATE);
		DecimalFormat dollarsAndCentsFormat = new DecimalFormat("$#,##0.00");
		System.out.printf("With HST and delivery charges, that comes to %s.\n",
				dollarsAndCentsFormat.format(fullPrice));

		// Close the Scanner object
		input.close();

	} // end main

} // end class

/**
 * Program:		rudra_patel_vendingmachine.java
 * Purpose:     in class assignment
 * Author:		Rudra patel
 * Date:		Oct. 27, 2022
 */


package com.company;

import java.util.*;
//import java.io.*;
//import java.io.File;

public class rudra_patel_VendingMachine {
    public static void main(String[] args)
    {

        // Display information
        System.out.println("Welcome to rudra's Vending Machine Simulation");
        System.out.println("---------------------------------------------------");
        System.out.println("This vending machine dispenses drinks.");
        System.out.println("Select a type of drink.");
        System.out.println("Then insert only toonies, loonies, or quarters.");
        System.out.println("---------------------------------------------------");
        // Create a Scanner object for getting user inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1, 2, 3, 4 for type of drink:");
//        int [] rudra = {1,2,3,4};
        int drink_Type = 0;
        double price_Drinks = 0;
//        input with condition
        do {
            drink_Type = input.nextInt();
            switch (drink_Type) {
                    case 1:
                        price_Drinks = 4.75;
                        break;
                    case 2:
                        price_Drinks = 2.50;
                        break;
                    case 3:
                        price_Drinks = 3.50;
                        break;
                    case 4:
                        price_Drinks = 5.25;
                        break;
                    default:
                        System.out.print("Error! Enter a valid choice (1-4): ");
                        break;

                }
        }while (drink_Type >= 5 || drink_Type < 0);
//        declaration for total
        double  choice_qlt = 0.0;
        double total_price = 0;
        System.out.println("\nInsert $"+price_Drinks+" for your drink selection.\n");
        //buffer
        input.nextLine();
        System.out.print("Enter Q (quarter) or L (loonie) or T (toonie):");
        //for loop condition for drink types
        for (total_price=0; total_price < price_Drinks; )
        {

            String choice = input.nextLine();

            if (choice.equals("Q")) {
                choice_qlt = 0.25;
                total_price += choice_qlt;
                System.out.print("Quarter inserted.");
                System.out.println("  Total = $"+total_price);
                System.out.print("Enter Q (quarter) or L (loonie) or T (toonie):");
            } else if (choice.equals("L")) {
                choice_qlt = 1.00;
                total_price += choice_qlt;
                System.out.print("Loonie inserted.");
                System.out.println("  Total = $"+total_price);
                System.out.print("Enter Q (quarter) or L (loonie) or T (toonie):");
            } else if (choice.equals("T")) {
                choice_qlt = 2.00;
                total_price += choice_qlt;
                System.out.print("Toonie inserted.");
                System.out.println("  Total = $"+total_price);
                System.out.print("Enter Q (quarter) or L (loonie) or T (toonie):");
            } else {
                System.out.print("Error! That coin is rejected. Enter a valid coin (Q, L, T):");
                choice_qlt = 0;
            }


        }
        double change_Would = total_price - price_Drinks;
        //end output
        System.out.println("\n\n Thank you for your purchase. \n Your drink has been dispensed.\n If this machine gave change, your change would be $"+change_Would);



    input.close(); // scanner close

    }//close main
}//close class



/*
	Program:		Rudra_Project_userInput.java
	Purpose:		Take a user input for choice and return it for next steps.
	Author:			rudra patel
	Date:			Nov 2, 2022
*/
import java.util.*;
public class Rudra_Project_userInput {
    /**
     * Method:  plaintext_or_ciphertext
     * import:  A int value.
     * Purpose: Get Plain text or Encipher text from user
     * Accepts : 1. A plaintext of type String for decipher or encipher
     * Returns: String text value for Encipher or Decipher
     */
    static String plaintext_or_ciphertext(int Input){
        Scanner input = new Scanner(System.in);
        String text;
        String secretCode = "0";
        if(Input == 2)
        {
            System.out.print("\nEnter the ciphertext message you wish to decipher: ");
//            secretCode = input.nextLine().toUpperCase();
//            text = secretCode;
        }
        else {
            System.out.print("\nEnter the plaintext message you wish to encipher: ");
//            secretCode = input.nextLine().toUpperCase();
//            text = secretCode;
        }
        secretCode = input.nextLine().toUpperCase();
        text = secretCode;
        return text;
    }
}

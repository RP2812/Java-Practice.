/*
	Program:		Rudra_Project_Cipher_Keyword_Input.java
	Purpose:		Type any KeyWord.
	Author:			Rudra patel
	Date:			Nov 2, 2022
*/
import java.util.Scanner;

public class Rudra_Project_Cipher_Keyword_Input {
    /**
     * Method:   Keyword
     * Purpose : Type any KeyWord.
     * Returns: keyword.
     */
    static String Keyword(){
        Scanner input = new Scanner(System.in);
        String keyword = "";
        System.out.print("Enter a keyword of only letters, with no digits, spaces, or punctuation marks: ");
        keyword = input.nextLine().toUpperCase();
        return keyword;
    }
}

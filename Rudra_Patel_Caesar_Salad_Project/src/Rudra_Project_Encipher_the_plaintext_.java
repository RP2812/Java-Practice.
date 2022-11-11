
import java.util.Scanner;
/*
	Program:		Rudra_Project_Encipher_the_plaintext_.java
	Purpose:		Import any Plaintext and keyword and encipher the Plaintext it.
	Author:			Rudra Patel
	Date:			Nov 2, 2022
*/
public class Rudra_Project_Encipher_the_plaintext_ {
    /**
     * Method:   encipher_the_plaintext_
     * Purpose : Import any Plaintext and keyword and encipher the Plaintext it.
     * Returns: Main_Answer.
     */
    static String encipher_the_plaintext_(String secretCode, int shift_key) {
        Scanner input = new Scanner(System.in);

        //convert cipher_TextIs to char and to unicode
        String Main_Answer;
        char[] cipher_TextIs_Chr = secretCode.toCharArray();
        int[] values_of_cipher_TextIs = new int[cipher_TextIs_Chr.length];
        char[] decipher_TextIs_Chr = new char[cipher_TextIs_Chr.length];

        for (int i = 0; i < cipher_TextIs_Chr.length; i++) {
            values_of_cipher_TextIs[i] = (int) cipher_TextIs_Chr[i];
            if (values_of_cipher_TextIs[i] < 65 || values_of_cipher_TextIs[i] > 90) {
                decipher_TextIs_Chr[i] = (char) values_of_cipher_TextIs[i];
            } else {
                decipher_TextIs_Chr[i] = (char) (values_of_cipher_TextIs[i] + shift_key);

                if ((values_of_cipher_TextIs[i] + shift_key) > 90) {
                    decipher_TextIs_Chr[i] = (char) (64 + shift_key);
                }
            }
        }//end for loop
        Main_Answer = new String(decipher_TextIs_Chr);
        System.out.println("\nThe plaintext and enciphered text are as follows:");
        System.out.println(secretCode);
        System.out.println(Main_Answer);

        return Main_Answer;

    }

}

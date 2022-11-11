import java.util.Scanner;

/*
	Program:		Rudra_Project_Decipher_the_EncipherText_.java
	Purpose:		Import any Plaintext and keyword and encipher the Plaintext it.
	Author:			Rudra patel
	Date:			Nov 2, 2022
*/
public class Rudra_Project_Decipher_the_EncipherText_ {

    /**
     * Method:   decipher_the_plaintext_
     * Purpose : Import any Encipher text and keyword and decipher the Plaintext it.
     * Returns: Main_Answer.
     */
    static void decipher_the_plaintext_(String secretCode, int[] shift_key,String Key_Word)
    {
        Scanner input = new Scanner(System.in);
        String Main_Answer;
        int j=0,k=0;
        int length = Key_Word.length();
        char[] cipher_TextIs_Chr = secretCode.toCharArray();
        int[] values_of_cipher_TextIs = new int[cipher_TextIs_Chr.length];
        char[] decipher_TextIs_Chr = new char[cipher_TextIs_Chr.length];
        for (int i = 0; i < cipher_TextIs_Chr.length; i++)
        {
            values_of_cipher_TextIs[i] = (int) cipher_TextIs_Chr[i];
        }//end for loop
        do {
            if (values_of_cipher_TextIs[k] < 65 || values_of_cipher_TextIs[k] > 90) {
                decipher_TextIs_Chr[k] = (char) values_of_cipher_TextIs[k];
                k++;
            } else {
                if ((values_of_cipher_TextIs[k] - shift_key[j]) < 65) {
                    decipher_TextIs_Chr[k] = (char) (91-(shift_key[j]-(values_of_cipher_TextIs[k]-65)));
                    k++;
                    j++;
                    if (j >= length) {
                        j = 0;
                    }
                } else {
                    decipher_TextIs_Chr[k] = (char) (values_of_cipher_TextIs[k] - shift_key[j]);
                    k++;
                    j++;
                    if (j >= length) {
                        j = 0;
                    }
                }
            }
        }while (k < cipher_TextIs_Chr.length);

        Main_Answer= new String(decipher_TextIs_Chr);
        System.out.println("\nThe plaintext and enciphered text are as follows:");
        System.out.println(secretCode);
        System.out.print(Main_Answer);
    }
}


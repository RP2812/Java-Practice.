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
    static void decipher_the_plaintext_(String secretCode, int shift_key)
    {

        String Main_Answer;
        char[] cipher_TextIs_Chr = secretCode.toCharArray();
        int[] values_of_cipher_TextIs = new int[cipher_TextIs_Chr.length];
        char[] decipher_TextIs_Chr = new char[cipher_TextIs_Chr.length];
        //convert cipher_TextIs to char and to unicode
        for (int i = 0; i < cipher_TextIs_Chr.length; i++)
        {
            values_of_cipher_TextIs[i] = (int) cipher_TextIs_Chr[i];
//                                System.out.println("value = "+ values_of_cipher_TextIs[i]);
            if(values_of_cipher_TextIs[i]<65||values_of_cipher_TextIs[i]>90 /*&& values_of_cipher_TextIs[i]<97||values_of_cipher_TextIs[i]>122*/)
            {
                decipher_TextIs_Chr[i] = (char) values_of_cipher_TextIs[i];
            }
            else
            {
                decipher_TextIs_Chr[i] = (char) (values_of_cipher_TextIs[i]- shift_key);

                if ((values_of_cipher_TextIs[i]- shift_key)<65) {
                    decipher_TextIs_Chr[i] = (char) (91 - shift_key);
                }
            }

        }//end for loop

        Main_Answer= new String(decipher_TextIs_Chr);
        System.out.println("\nThe plaintext and enciphered text are as follows:");
        System.out.println(secretCode);
        System.out.print(Main_Answer);
    }
}


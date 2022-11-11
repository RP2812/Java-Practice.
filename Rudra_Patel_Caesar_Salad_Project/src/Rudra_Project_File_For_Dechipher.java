import java.io.File;
import java.io.IOException;
import java.util.*;
/*
	Program:		Rudra_Project_File_For_Dechipher.java
	Purpose:		Convert cipher text to plain text!!
	Author:			rudra patel
	Date:			Nov 2, 2022
*/
public class Rudra_Project_File_For_Dechipher {

    /**
     * Method:  Deciphering_From_File
     * Purpose : Take name which contain cipher text for file with (.txt) extension from user and read file and
     * copy file text to any string and save and decipher it and print it.
     * Returns: Void
     */
    static void Deciphering_From_File()
    {
        Scanner input = new Scanner(System.in);
        String fileName;
        String Main_Answer;
        String line="0";
        System.out.print("Enter the name of the file containing the ciphertext: ");
        fileName = input.nextLine();
        String Key_Word = Rudra_Project_Cipher_Keyword_Input.Keyword();
        int shift_key = Rudra_Project_Shift_Keyword.Shift_Key(Key_Word);
        File myFile = new File(fileName);
        try {

            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
            }//end of while

        } //end of try
        catch (IOException e) {
            throw new RuntimeException(e);
        }//end of catch
        //convert cipher_TextIs to char and to unicode
        char[] cipher_TextIs_Chr = line.toCharArray();
        int[] values_of_cipher_TextIs = new int[cipher_TextIs_Chr.length];
        char[] decipher_TextIs_Chr = new char[cipher_TextIs_Chr.length];
        for (int i = 0; i < cipher_TextIs_Chr.length; i++) {
            values_of_cipher_TextIs[i] = (int) cipher_TextIs_Chr[i];
//                                System.out.println("value = "+ values_of_cipher_TextIs[i]);
            if (values_of_cipher_TextIs[i] < 65 || values_of_cipher_TextIs[i] > 90 /*&& values_of_cipher_TextIs[i]<97||values_of_cipher_TextIs[i]>122*/) {
                decipher_TextIs_Chr[i] = (char) values_of_cipher_TextIs[i];
            } else {
                decipher_TextIs_Chr[i] = (char) (values_of_cipher_TextIs[i] - shift_key);

                if ((values_of_cipher_TextIs[i] - shift_key) < 65) {
                    decipher_TextIs_Chr[i] = (char) (91 - shift_key);
                }
            }
        }
        Main_Answer= new String(decipher_TextIs_Chr);
        System.out.println("\nThe plaintext and enciphered text are as follows:");
        System.out.println(cipher_TextIs_Chr);
        System.out.print(Main_Answer+"\n");
    }

    }

/*
	Program:		Rudra_Project_Main_Method.java
	Purpose:		Print and call all methods.
	Author:			rudra patel
	Date:			Nov 2, 2022
*/
import java.util.Scanner;

public class Rudra_Project_Main_Method {

    /**
     *
     * Method:- main method
     * Accepts:- nothing
     * purpose:- to call all other method for program
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Key_Word,use_NameFile,plainText ="",Main_Answer;
        int decipher_choice=0;
        int shift_key = 0;
        System.out.println("Prototype for a Super_Caesar_Caesar Shift Encoding Application.");
        System.out.println("\nThis program will help you encipher a message or decipher a coded message.\n");
        int choice_1or2;
        String secretCode = "0";
        System.out.print("If enciphering, enter 1 and press ENTER:\nIf deciphering, enter 2 and press ENTER:\nEnter 1 or 2: ");
        do{
            choice_1or2 = input.nextInt();
            if (choice_1or2==1||choice_1or2==2) {

                if (choice_1or2==2) {
                    System.out.println("We will be deciphering a message\n");
                    System.out.print("If ciphertext will be entered via keyboard, enter 1.\nIf ciphertext will be entered from a file, enter 2.\nEnter 1 or 2: ");

                    do {
                        decipher_choice = input.nextInt();
                        input.nextLine();
                        if (decipher_choice == 1 || decipher_choice == 2) {
                            if (decipher_choice == 1) {
                                plainText = Rudra_Project_userInput.plaintext_or_ciphertext(choice_1or2);
                                Key_Word = Rudra_Project_Cipher_Keyword_Input.Keyword();
                                shift_key = Rudra_Project_Shift_Keyword.Shift_Key(Key_Word);
                                Rudra_Project_Decipher_the_EncipherText_.decipher_the_plaintext_(plainText,shift_key);
                            } else {
                                Rudra_Project_File_For_Dechipher.Deciphering_From_File();
                            }
                        } else {
                            System.out.print("please choose number 1 OR 2: ");
                        }
                    } while (decipher_choice < 1 || decipher_choice > 2);

                }
                else {
                    plainText = Rudra_Project_userInput.plaintext_or_ciphertext(choice_1or2);
                    Key_Word = Rudra_Project_Cipher_Keyword_Input.Keyword();
                    shift_key = Rudra_Project_Shift_Keyword.Shift_Key(Key_Word);
                    Main_Answer = Rudra_Project_Encipher_the_plaintext_.encipher_the_plaintext_(plainText,shift_key);
                    use_NameFile = Rudra_Project_Enciphered_Text_To_File.Enciphered_Text_To_File(Main_Answer);
                    System.out.print("Ciphertext has been written to local directory as "+use_NameFile+ "\n");


                }
            }
            else
            {
                System.out.print("please choose number 1 OR 2: ");
            }
        }while(choice_1or2<1||choice_1or2>2);



        }

    }
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
	Program:		Rudra_Project_Enciphered_Text_To_File.java
	Purpose:		Take any name for file with (.txt) extension from user and create file with that name and save
     *              and write encipher word in it!!
	Author:			rudra patel
	Date:			Nov 2, 2022
*/
public class Rudra_Project_Enciphered_Text_To_File {
    /**
     * Method:  Deciphering_From_File
     * Purpose : Take any name for file with (.txt) extension from user and create file with that name and save
     *           and write encipher word in it!!
     * Returns: use_Namefile.
     */
    static String Enciphered_Text_To_File(String Main_Answer){
        Scanner input = new Scanner(System.in);
        String use_Namefile;
        System.out.println("\nEnciphered text will now be written to a text file.");
        System.out.print("Enter a file name followed by the extension '.txt' (example: secret.txt): ");
        use_Namefile = input.nextLine();
        File myFile = new File(use_Namefile);
        try {
            myFile.createNewFile();
        } catch (IOException e)
        {
            System.out.println("unable to create this file");
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter(use_Namefile);
            fileWriter.write(Main_Answer);
//            fileWriter.write((int) x);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return use_Namefile;
    }

}

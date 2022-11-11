/*
	Program:		Rudra_Project_Shift_Keyword.java
	Purpose:		Import Keyword from other method and count the shift key value and return it for next steps.
	Author:			rudra patel
	Date:			Nov 2, 2022
*/

public class Rudra_Project_Shift_Keyword
{

    /**
     * Method:  Shift_Key
     * import:  A String value.
     * Purpose: Count the shift key value
     * Accepts : 1. A Key_Word of type String for Count the shift key value
     * Returns: int shift_key for Encipher or Decipher
     */
    static int Shift_Key(String Key_Word)
    {
        int shift_key = 0;
        int total = 0;
        char[] keyword_array = Key_Word.toCharArray();
        int[] values_of_keywords = new int[keyword_array.length];
        for (int i = 0; i < keyword_array.length; i++) { //for loop to keyword to shift key
            values_of_keywords[i] = (int) keyword_array[i];
            total += values_of_keywords[i];
        }
        shift_key = total % 26;
//                shift_key = shift_key==0 ? shift_key = 1 : shift_key;
        if(shift_key==0)
        {
            shift_key = 1;
        }//if for shiftkey
        else
        {
            shift_key = shift_key;
        }//else of shift

        return shift_key;
    }
}

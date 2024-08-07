package patterns_using_numb_alpha;

import java.util.Scanner;

class Alphabet_DiamondShape_pattern_07 {
    public static void main(String[] args) {
        char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z' };
        int letter_number = 0;
        String[] diamond = new String[26]; // array of strings
        System.out.print("Enter a Character between A to Z : ");

        Scanner reader = new Scanner(System.in);
        try {
            char user_letter = reader.next("[A-Z]").charAt(0);
            // search for letter number in the array letter
            for (int i = 0; i < letter.length; i++) {
                if (letter[i] == user_letter) {
                    letter_number = i;
                    break;
                }
            }

            // construct diamond
            for (int i = 0; i <= letter_number; i++) {
                diamond[i] = "";
                // add initial spaces
                for (int j = 0; j < letter_number - i; j++) {
                    diamond[i] += " ";
                }

                // add letter
                diamond[i] += letter[i];

                // add space between letters
                if (letter[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    } 
                } // Add missing opening curly brace
                // add letter
                diamond[i] += letter[i];
                
                // Draw the first part of the diamond
                System.out.println(diamond[i]);
            } 
            for (int i = letter_number - 1; i >= 0; i--) {
                // Draw the second part of the diamond
                // Writing the diamondArray in reverse order
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
//Needs to enter capital letters only as input 

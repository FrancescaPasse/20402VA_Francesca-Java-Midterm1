package string_problems;

import java.util.Locale;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String palWord = "help";
        String remain = " ";
        int palWordLength= palWord.length();
        for (int i = (palWordLength -1); i>=0; i--)
            remain = remain + palWord.charAt(i);
        if (palWord.toLowerCase().equals(remain.toLowerCase())) {
            System.out.println(palWord + " is a palindrome");
        }
        else {
            System.out.println(palWord + " is not a palindrome");
            
        }
    }
    
    

}

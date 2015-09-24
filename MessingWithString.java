package location;

import java.util.Scanner;

/**
 *
 * @author TGuptaNYC
 */
public class Location {

    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 9/21/2016
            Description: Takes a string
            Output: How many characters, whether it starts with a vowel, how many uppercase letters, how many numbers
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input a string.");
        String input = in.nextLine();
        // gets user inputted string
        
        int len = input.length();
        System.out.println("The number of characters in your string is " + len + ".");
        // finds length and outputs it
        
        String lowercaseString = input.toLowerCase();
        // make new string with all of inputted string lowercase
        
        if (lowercaseString.charAt(0) == 'a') {
            System.out.println("The first character of your string is a vowel!");
        } else if (lowercaseString.charAt(0) == 'e') {
            System.out.println("The first character of your string is a vowel!");
        } else if (lowercaseString.charAt(0) == 'o') {
            System.out.println("The first character of your string is a vowel!");
        } else if (lowercaseString.charAt(0) == 'u') {
            System.out.println("The first character of your string is a vowel!");
        } else if (lowercaseString.charAt(0) == 'i') {
            System.out.println("The first character of your string is a vowel!");
        } else {
            System.out.println("The first character of your string is NOT a vowel!");
        }
        // tests whether the first character in the lowercase string is a vowel
        
        int numbers = 0;
        
        for(int i = 0; i<len;) {
            char currentcharacter = lowercaseString.charAt(i);
            if (Character.isDigit(currentcharacter) == true) {
                numbers++;
                i++;
            } else { 
               i++;
            }
            
        }
        System.out.println("There are " + numbers + " numbers in your string.");
        // finds the number of numbers in user inputted string and outputs
        
        // Success - 9/24/15
        
    }
    
}

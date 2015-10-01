package characterapplication;
import java.util.Scanner;

/**
 * @author TGuptaNYC
 */

public class CharacterApplication {

    
    public static void main (String[] args) throws Exception {
        /* 
            Author: TGuptaNYC
            Date: 9/30/2016
            Title: CharacterApplication
            Description: takes an input of five characters
            Output: displays the characters with their total ASCII value
        */
        Scanner in = new Scanner(System.in);        
        int total = 0;
        String input = "";
        String str = "";
        // initializes Scanner and input variables
        
        for (int i=0; i<5; i++)
            {
                input = in.next();
                str += input;
                total += input.charAt(0);                              
            }        
        // inputs characters and finds sum of ASCIIs after converting String to char
        
        System.out.println(str + " has a value of "+ total + ".");
        System.out.println(input+ " has a value of "+(int)input.charAt(0));
        
        // ouput as expected
    }
    
    
}

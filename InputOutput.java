package inputoutput;
import java.io.Console;
import javax.swing.JOptionPane;

/**
 *
 * @author TGuptaNYC
 */
public class InputOutput {

    public static void main(String[] args) {
        
        /* 
            Author: TGuptaNYC
            Date: 9/17/2016
            Description: Takes in a user-inputted name and 3 golf scores without Scanner Class
            Output: Prints Name and Average of 3 Golf Scores with System.println()
        */
        
        String first_name;
        first_name = JOptionPane.showInputDialog("First Name");
        // gets first name
        
        String last_name;
        last_name = JOptionPane.showInputDialog("Last Name");
        // gets last name
        
        String first_score;
        first_score = JOptionPane.showInputDialog("First Score");
        int firstscore = Integer.parseInt(first_score);
        // gets first score and converts it to an int
        
        String second_score;
        second_score = JOptionPane.showInputDialog("Second Score");
        int secondscore = Integer.parseInt(second_score);
        // gets second score and converts it to an int
        
        String third_score;
        third_score = JOptionPane.showInputDialog("Third Score");
        int thirdscore = Integer.parseInt(third_score);
        // gets third score and converts it to an int
        
        int average;
        average = (firstscore + secondscore + thirdscore)/3;
        // finds average of three scores       
        
        String full_name;
        full_name = "Your name is " + first_name + " " + last_name + " and the average of your three scores is " + average + ".";
        // creates message to user with user's name and average of scores
        
        JOptionPane.showMessageDialog(null, full_name);
        // prints message full_name
        
        System.exit(0);
        // exits
        
        /*
            Finished: 09/17/2015
            Output: As expected
        */
        
        
        
    }
    
}

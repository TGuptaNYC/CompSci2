package exactagecalc;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author TGuptaNYC
 */
public class ExactAgeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 9/21/2016
            Description: Takes a string
            Output: How many characters, whether it starts with a vowel, how many uppercase letters, how many numbers
        */
        
        String name;
        name = JOptionPane.showInputDialog("What is your name?");
        // gets name
        
        String year;
        year = JOptionPane.showInputDialog("What year were you born in? Format: YYYY");
        int numberyear = Integer.parseInt(year);
        // gets year born
        
        String month;
        month = JOptionPane.showInputDialog("What month were you born in? Format: MM");
        int numbermonth = Integer.parseInt(month);
        // gets month born
        
        String day;
        day = JOptionPane.showInputDialog("What day were you born in? Format: DD");
        int numberday = Integer.parseInt(day);
        // gets day born
        
        Calendar now = Calendar.getInstance();
        // makes a calendar instance
        
        int currentday = now.get(Calendar.DAY_OF_MONTH);
        // finds current day
        
        int currentmonth = now.get(Calendar.MONTH);
        // finds current month
                
        int currentyear = now.get(Calendar.YEAR);
        // finds current year
        
        int amountofyears = 0;
        // initializes amountofyears
        
        System.out.println(amountofyears);
        
    }
    
}

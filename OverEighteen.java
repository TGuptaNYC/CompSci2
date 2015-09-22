package overeighteen;

import javax.swing.JOptionPane;

/**
 *
 * @author TGuptaNYC
 */
public class OverEighteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 9/17/2016
            Description: Takes User's Name and Birthday
            Output: Tells if user is eighteen or not
        */
        
        String first_name;
        first_name = JOptionPane.showInputDialog("First Name");
        // gets first name
        
        String last_name;
        last_name = JOptionPane.showInputDialog("Last Name");
        // gets last name
        
        String month;
        month = JOptionPane.showInputDialog("Month (Format MM)");
        int month = Integer.parseInt(month);
        
        String year;
        year = JOptionPane.showInputDialog("Year (Format YYYY)");
        int year = Integer.parseInt(year);
        
        String output;
        
        if (2015 - year > 18) {
            output = (first_name + " " + last_name + ", you are over EIGHTEEN!");
            JOptionPane.showMessageDialog(null, output);
            
        }   else if ((2015 - year) = 18) {
            
            if (9 - month >= 0) {
                output = (first_name + " " + last_name + ", you are over EIGHTEEN!");
                JOptionPane.showMessageDialog(null, output);
            }
            
            else {
                output = (first_name + " " + last_name + ", you are NOT over EIGHTEEN!");
                JOptionPane.showMessageDialog(null, output);
                
            }
                                  
        }   else {
                output = {first_name + " " + last_name + ", you are NOT over EIGHTEEN!");
                JOptionPane.showMessageDialog(null, output);
          
        }
        
        System.exit(0);
        
    }
    
    
}

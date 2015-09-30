
package libraryfine;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TGuptaNYC
 */
public class LibraryFine {

    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 9/29/2016
            Title: LibraryFine
            Description: Takes user's name and 10 library fines
            Output: User's Name, Fines, Max and Min fine
        */
        
        Scanner input = new Scanner(System.in);
        
        String firstname, middlename, lastname;
        System.out.println("Enter first name.");
        firstname = input.next();
        // gets first name
        System.out.println("Enter middle name.");
        middlename = input.next();
        // gets middle name
        System.out.println("Enter last name.");
        lastname= input.next();
        // gets last name
         
        double[] fine;
        fine = new double[10];
        // creates array for fines
  
        for(int loop = 0; loop < 10;) {
            int finenum = loop + 1;
            System.out.println("Enter " + finenum + "st fine.");
            fine[loop] = input.nextDouble();
            loop++;
        }
                
        double maxfine = Math.max( fine[0], Math.max( fine[1], Math.max( fine[2], Math.max( fine[3], Math.max( fine[4], Math.max( fine[5], Math.max( fine[6], Math.max( fine[7], Math.max(fine[8], fine[9])))))))));
        double minfine = Math.min( fine[0], Math.min( fine[1], Math.min( fine[2], Math.min( fine[3], Math.min( fine[4], Math.min( fine[5], Math.min( fine[6], Math.min( fine[7], Math.min(fine[8], fine[9])))))))));
        // finds max and min of arrays
        
        double sum = fine[0] + fine[1] + fine[2] + fine[3] + fine[4] + fine[5] + fine[6] + fine[7] + fine[8] + fine[9];
        // finds sum
        
        String output;
        output = firstname + " " + middlename + " " + lastname + ", your total fine is $" + sum;
        JOptionPane.showMessageDialog(null, output);
        
        String maxfineoutput = "Your maximum fine is " + maxfine;
        JOptionPane.showMessageDialog(null, maxfineoutput);
        
        String minfineoutput = "Your minimum fine is " + minfine;
        JOptionPane.showMessageDialog(null, minfineoutput); 
        
        // output as expected - 9/30/15
        
    }
    
}

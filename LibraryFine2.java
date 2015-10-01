
package libraryfine2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TGuptaNYC
 */
public class LibraryFine2 {

    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 9/29/2016
            Title: LibraryFine2
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
  
        double maxfin = -1;
        double minfin = 11;
        double sum = 0;
        // intializes variables
        
        for(int loop = 0; loop < 10;) {
            int finenum = loop + 1;
            System.out.println("Enter fine number " + finenum);
            double fine = input.nextDouble();
            // inputs fine
            sum += fine;
            // finds sum
            if (fine > maxfin) {
                maxfin = fine;
            }
            // finds max
            if (minfin > fine) {
                minfin = fine;
            }
            // finds min
            loop++;
        }
             
        String output;
        output = firstname + " " + middlename + " " + lastname + ", your total fine is $" + sum;
        JOptionPane.showMessageDialog(null, output);
        
        String maxfineoutput = "Your maximum fine is $" + maxfin;
        JOptionPane.showMessageDialog(null, maxfineoutput);
        
        String minfineoutput = "Your minimum fine is $" + minfin;
        JOptionPane.showMessageDialog(null, minfineoutput); 
        
        // output as expected - 9/30/15
        
    }
    
}

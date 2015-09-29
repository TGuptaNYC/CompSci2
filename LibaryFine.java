
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
        
        double fine1, fine2, fine3, fine4, fine5, fine6, fine7, fine8, fine9, fine10;
        double maxfine = Math.max( fine1, Math.max( fine2, Math.max( fine3, Math.max( fine4, Math.max( fine5, Math.max( fine6, Math.max( fine7, Math.max( fine8, Math.max(fine9, fine10)))))))));
        
        
    }
    
}

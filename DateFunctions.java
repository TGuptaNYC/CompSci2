package datefunctions;

import java.util.Scanner;

/**
 *
 * @author TGuptaNYC
 */
public class DateFunctions {

    public static void main(String[] args) throws Exception {
        /* 
            Author: TGuptaNYC
            Date: 10/7/2016
            Title: DateFunctions
            Description: 
            Output: 
        */
        Scanner input = new Scanner (System.in);
        
        System.out.println("Insert Month in MM format.");
        int month = input.nextInt();
        
        System.out.println("Insert Day in DD format");
        int day = input.nextInt();
        
        System.out.println("Input year in YYYY format.");
        int year = input.nextInt();    
        
        System.out.println("Input Julian Date to be converted in YYYYDDD format.");
        int julian = input.nextInt();
        
        System.out.println("Input first date in YYYYMMDD format.");
        int firstdate = input.nextInt();
        
        System.out.println("Input second date in YYYYMMDD format");
        int seconddate = input.nextInt();
        
        // inputs
        
        
        System.out.println(JulianDate(month, day, year));
        System.out.println(NormalDate(julian));
        System.out.println(DaysBetween(firstdate, seconddate));
        
        // outputs
    }
    
    public static String JulianDate(int month, int day, int year) {
        // start date of JulianDate = January 1, 4713 B.C.
        int newyear = year + 4713;
        int newday = month * 30 + day;
        String syear;
        syear = Integer.toString(newyear);
        String sday;
        sday = Integer.toString(newday);        
        String output = syear+sday;
        return output;
        
    }
    
    public static int NormalDate(int julian) {
        
    }
    
    public static int DaysBetween(int firstdate, int seconddate) {
        /* input dates in YYYYMMDD */
    }
}

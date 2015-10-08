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
        System.out.println(normalDate(julian));
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
    
    public static String normalDate(int julian) {
        String sjulian = Integer.toString(julian);
        String syear =  sjulian.substring(0, 3);
        int nyear  = Integer.parseInt(syear);
        nyear = nyear - 4713;
        String sday = sjulian.substring(4, 6);
        int day = Integer.parseInt(sday);
        int nmonth = day/30;
        int nday = day%30;
        
        String smonth = "";
        if ((Integer.toString(nmonth)).length() == 1) {
            smonth = "0" + nmonth;
        } else {
            smonth = Integer.toString(nmonth);
        }
        
        String oday;
        if ((Integer.toString(nday)).length() == 1) {
            oday = "0" + nday;
        } else {
            oday = Integer.toString(nday);
        }
        String output = smonth + " " + oday + " " + Integer.toString(nyear);
        return output;
    }
    
    public static int DaysBetween(int firstdate, int seconddate) {
        /* input dates in YYYYMMDD */
        int nfyear = Integer.parseInt(((Integer.toString(firstdate)).substring(0,3)));
        int nfmonth = Integer.parseInt(((Integer.toString(firstdate)).substring(4,5)));
        int nfday = Integer.parseInt(((Integer.toString(firstdate)).substring(6,7)));
        int nsyear = Integer.parseInt(((Integer.toString(seconddate)).substring(0,3)));
        int nsmonth = Integer.parseInt(((Integer.toString(seconddate)).substring(4,5)));
        int nsday = Integer.parseInt(((Integer.toString(seconddate)).substring(6,7)));
        
        int fdy = nfday + nfmonth*30 + nfyear * 365;
        int sdy = nsday + nsmonth*30 + nsyear * 365;
        int difference = Math.abs(fdy-sdy);             
        return difference;
    }
}

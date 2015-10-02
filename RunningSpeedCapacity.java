package runningspeedcapacity;
import java.util.Scanner;

/**
 * @author TGuptaNYC
 */

public class RunningSpeedCapacity {

    
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 10/2/2016
            Title: RunningSpeedCapacity
            Description: takes height, weight, stride
            Output: doutputs max running speed
        */
        
        Scanner input = new Scanner(System.in);
        // creates Scanner
        
        System.out.println("Input height in inches.");
        double height = input.nextDouble();
        
        System.out.println("Input weight in pounds.");
        double weight = input.nextDouble();
        
        System.out.println("Input running stride in feet.");
        double stride = input.nextDouble();
        
        System.out.println(RunningSpeedCapacity(height, weight, stride));
        
        // output as expected
        
    }
    
    public static double RunningSpeedCapacity(double height, double weight, double stride) {
        double z = height/weight * stride * 8;
        return z;        
    }
    
}

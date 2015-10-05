package runningspeedcapacity2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * @author TGuptaNYC
 */

public class RunningSpeedCapacity2 {

    
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 10/2/2016
            Title: RunningSpeedCapacity
            Description: takes height, weight, stride of 5 people
            Output: outputs a sorted
        */
        
        Scanner input = new Scanner(System.in);
        // creates Scanner
        
        double[] player;
        player = new double[5];
        
        for (int clock = 0; clock < 5; clock++) {
            System.out.println("Input height in inches.");
            double height = input.nextDouble();
        
            System.out.println("Input weight in pounds.");
            double weight = input.nextDouble();
        
            System.out.println("Input running stride in feet.");
            double stride = input.nextDouble();
            
            player[clock] = RunningSpeedCapacity(height, weight, stride); 
        }
        
        Arrays.sort(player);
        
        for (int clock2 = 0; clock2 < 5; clock2++) {
            System.out.println(player[clock2]);
        }
        
    }
    
    public static double RunningSpeedCapacity(double height, double weight, double stride) {
        double z = height/weight * stride * 8;
        return z;        
    }
    
    // nothing under is finished
    public static double Race(double a, double b, double c, double d, double e) {
        int START = 1;
        int END = 5;
        Random random = new Random();
        for (int idx = 1; idx <= 10; ++idx){
            showRandomInteger(START, END, random);
            
        }
    
        double winner;
        return winner;
    }

}

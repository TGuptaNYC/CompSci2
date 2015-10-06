package runningspeedcapacity2;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author TGuptaNYC
 */

public class RunningSpeedCapacity2 {

    
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 10/2/2016
            Title: RunningSpeedCapacity
            Description: takes height, weight, stride of 5 people, finds their running speeds and chooses a winner using random factors
            Output: outputs the winner
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
        String win = Race(player[0],player[1],player[2],player[3],player[4]);
        System.out.println(win);
    }
    
    public static double RunningSpeedCapacity(double height, double weight, double stride) {
        double z = height/weight * stride * 8;
        return z;        
    }
    
    public static String Race(double a, double b, double c, double d, double e) {
        double[] speeds;
        speeds = new double[5];
        
        speeds[0] = Math.random()*10*a;
        speeds[1] = Math.random()*10*b;
        speeds[2] = Math.random()*10*c;
        speeds[3] = Math.random()*10*d;
        speeds[4] = Math.random()*10*e;
        
        double max1 = Math.max(speeds[0], speeds[1]);
        double max2 = Math.max(speeds[2], speeds[3]);
        double max3 = Math.max(max1, max2);
        double winner = Math.max(speeds[4], max3);
        
        String name = null;
        double speed = 0;  
        
        if (winner==speeds[0]) {
            name = "Person 1 Wins with the speed of ";
            speed = a;
        } else if (winner==speeds[1]) {
            name = "Person 2 Wins with the speed of ";
            speed = b;
        } else if (winner==speeds[2]) {
            name = "Person 3 Wins with the speed of ";
            speed = c;            
        } else if (winner==speeds[3]) {
            name = "Person 4 Wins with the speed of ";
            speed = d;            
        } else if (winner==speeds[4]) {
            name = "Person 5 Wins with the speed of ";
            speed = e;
        }
        
        String output = name + " " + speed;
        return output;
    }
    
    // output as expected 10/6/15
}

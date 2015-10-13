package rectanglefunction;
import java.util.Scanner;

public class RectangleFunction {
    
    /* 
            Author: TGuptaNYC
            Date: 10/13/2016
            Title: RectangleFunction   
            Description: takes coordinates of the bottom left point and top right point
            Output: outputs whether a point is in the rectangle and if the points make a rectangle
        */

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); // creates Scanner
        System.out.println("Input x value of first coordinate.");
        double x1 = input.nextDouble();
        System.out.println("Input y value of first coordinate.");
        double y1 = input.nextDouble();
        System.out.println("Input x value of second coordinate.");
        double x2 = input.nextDouble();
        System.out.println("Input y value of second coordinate.");
        double y2 = input.nextDouble();
        System.out.println("Input x value of testing coordinate.");
        double x3 = input.nextDouble();
        System.out.println("Input y value of testing coordinate");
        double y3 = input.nextDouble();
        
        System.out.println(checkpoint(x1, y1, x2, y2, x3, y3));
        System.out.println("break");
        System.out.println(isarectangle(x1, y1, x2, y2));
        
    }
    
    public static boolean checkpoint(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 < x3 && x3 < x2 && y1 < y3 && y3 < y2) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isarectangle(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return false;
        } else {
            return true;
        }
    }
    
}

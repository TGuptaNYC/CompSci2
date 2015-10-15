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
        // takes in inputs of bottom left point coordinate, top right point coordinate and point to be tested
        
        System.out.println(checkpoint(x1, y1, x2, y2, x3, y3)); // checks if point (x3, y3) is in the rectangle made by (x1, y1) and (x2, y2)
        System.out.println("break"); // outputs break between outputs
        System.out.println(isarectangle(x1, y1, x2, y2)); // checks if (x1, y1) and (x2, y2) make a valid rectangle
        // outputs of variables are booleans: true or false
    }
    
    public static boolean checkpoint(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 < x3 && x3 < x2 && y1 < y3 && y3 < y2) {
            return true;
        } else {
            return false;
        }
        
        /* checkpoint checks whether the point to be tested (x3, y3) is in the rectangle made by (x1, y1) and (x2, y2)
        if the point's x-value is in between the x-values of the rectangle's vertices and
        the point's y-value is in between the y-values of the rectangle's vertices,
        then the point is in the rectangle.
        */
    }
    
    public static boolean isarectangle(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return false;
        } else {
            return true;
        }
        /*
        isarectangle checks whether the rectangle made by points (x1, x2) and (y1, y2) is, in fact, a rectangle.
        since the program is given that (x1, y1) will be the bottom left vertice and (x2, y2) will by the top right vertice,
        any set of points will create a rectangle, unless the either the x-values or the y-values of the vertices are equal.
        if the vertices are equal, the vertices do not make a rectangle
        */
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

import java.math.BigDecimal;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19guptat
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // hamburgers
        
        int x = in.nextInt();
        String y = in.next();
        int z = in.nextInt();
        String a = in.next();
        double cost = 0;
        switch (y) {
            case "h":
                cost += x*1.19;
                break;
            case "c":
                cost += x*1.39;
                break;
        }
        switch (a) {
            case "h":
                cost = cost + z*1.19;
                break;
            case "c":
                cost = cost + z*1.39;
                break;
        }
        BigDecimal result = new BigDecimal(cost*1.05).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Total with tax = $" + result);
        double r = result.doubleValue();
        double payment = in.nextDouble();
        System.out.println("Customer change = $" + (payment-r));
        
        System.out.println("Input first number."); // calculator
        double p = in.nextDouble();
        System.out.println("Input second number.");
        double q = in.nextDouble();
        System.out.println("Input math operation. + for add, - for subtraction, / for division, * for multiplication, ^ for exponents, % for mods.");
        String e = in.next(); // inputs
        System.out.println("Answer = " + operation(p, q, e)); // outputs
        
        String side1, side2; // right triangle
        double side1Double, side2Double, hypotenuse, temp;
        System.out.println("What does side one equal?");
        side1 = in.next();
        System.out.println("What does side two equal?");
        side2 = in.next();
        side1Double = Double.parseDouble(side1);
        side2Double = Double.parseDouble(side2);
        temp = (side1Double * side1Double) + (side2Double * side2Double);
        hypotenuse = Math.sqrt(temp);
        System.out.println("Your hypotenuse is " + hypotenuse);
        
        System.out.println("Would you like to unput the alpha or beta angle?");
        String tempString = in.next();
        String alphaString, betaString;
        double alpha, beta;
        if (tempString.equals("alpha"))
        {
            System.out.println("What do you want the value to be?");
            alphaString = in.next();
            alpha = Double.parseDouble(alphaString);
            beta = 180 - (90 + alpha);
            System.out.println("Your beta value is: " + beta);
        } else {
            System.out.println("What do you want the value to be?");
            betaString = in.next();
            beta = Double.parseDouble(betaString);
            alpha = 180 - (90 + beta);
            System.out.println("Your alpha value is " + alpha);
        }
        
        String SupOrRep = in.next(); // window cleaner
        double wax = in.nextDouble();
        double soap = in.nextDouble();
        double cleaner = in.nextDouble();
        double totalsales = wax*13.95 + soap*17.95 + cleaner*29.95;
        double sales;
        double commission = 0;
        double bonus = 0;
        if (SupOrRep.equals("S")) {
            System.out.println("Wax sales = &" + wax*13.95);
            System.out.println("Soap sales = $" + soap*17.95);
            System.out.println("Cleaner sales = $" + cleaner*29.95);
            System.out.println("Total sales = $" + totalsales);
            commission = totalsales*0.07;
            System.out.println("Commission = $" + commission);
            if (300 < totalsales) {
                bonus = 100;
            }
            System.out.println(bonus);
            System.out.println("Gross pay is $" + commission+bonus);
        } else if (SupOrRep.equals("R")) {
            System.out.println("Wax sales = &" + wax*13.95);
            System.out.println("Soap sales = $" + soap*17.95);
            System.out.println("Cleaner sales = $" + cleaner*29.95);
            System.out.println("Total sales = $" + totalsales);
            commission = totalsales*0.05;
            System.out.println("Commission = $" + commission);
            if (200 < totalsales) {
                bonus = 100;
            }
            System.out.println("Bonus = $" + bonus);
            System.out.println("Gross pay is $" + commission+bonus);
            
            System.out.println("Enter the number of Gallons of Gas:");
            double gallons = in.nextDouble();
            System.out.println("Enter the Type of Gas (or input N for NONE):");
            String gas = in.next();
            System.out.println("Enter Y to obtain a wash or N for no wash:");
            double totalgas = 0;
            if (gas == "R") {
              totalgas += gallons * 1.149;
            }
            else if (gas == "P") {
              totalgas += gallons * 1.199;
            }
            else if (gas == "S") {
                  totalgas += gallons * 1.289;
            }
            else if (gas == "N") {
              totalgas = 0;
            }
            double carwash = 0;
            if (totalgas >= 10.00) {
                carwash += 1.25;
            } else {
              carwash += 3.00;
            }
            System.out.println("The total price of gas is " + totalgas);
            System.out.println("The cost of the car wash is " + carwash);
            System.out.println("The total amount due is " + (totalgas + carwash));
            
            // see Holiday.java for part 6
            
            
        }
    }
    

    public static double operation(double a, double b, String c) {
        
        double r; // initiliazes output variable
        r = 0;
        
        switch (c) {
            case "+": r = a + b; // addition
                break;
            case "-": r = a - b; // subtraction
                break;
            case "*": r = a * b; // multiplication
                break;
            case "/": r = a / b; // division
                break;
            case "^": r = Math.pow(a, b); // exponents
                break;
            case "%": r = a % b; // mods
                break;
            default: System.out.println("Invalid Operation."); // invalid statement
                break;                
        }
        
        return r;
    }
}

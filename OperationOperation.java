package operationoperation;
import java.util.Scanner;
public class OperationOperation {
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 10/9/2016
            Title: OperationOperation   
            Description: takes in two numbers and a sign
            Output: outputs the answer
        */
        Scanner input = new Scanner(System.in); // creates Scanner
        System.out.println("Input first number.");
        double a = input.nextDouble();
        System.out.println("Input second number.");
        double b = input.nextDouble();
        System.out.println("Input math operation. + for add, - for subtraction, / for division, * for multiplication, ^ for exponents, % for mods.");
        String c = input.next();
        
        System.out.println(operation(a, b, c));
       
        
    }
    
    public static double operation(double a, double b, String c) {
        
        double r;
        r = 0;
        
        switch (c) {
            case "+": r = a + b;
                break;
            case "-": r = a - b;
                break;
            case "*": r = a * b;
                break;
            case "/": r = a / b;
                break;
            case "^": r = Math.pow(a, b);
                break;
            case "%": r = a % b;
                break;
            default: System.out.println("Invalid Operation.");
                break;                
        }
        
        return r;
        
        // output as expected
    }
        
}

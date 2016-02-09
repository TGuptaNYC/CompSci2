package fastfood2;
import java.util.Scanner;

public class FastFood2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double customers = 0;
        while (true) {
            System.out.println("How many hamburgers do you want?");
            int number_of_hamburgers = input.nextInt();
      
            System.out.println("How many cheeseburgers do you want?");
            int number_of_cheeseburgers = input.nextInt();
      
            double total = (number_of_hamburgers * 1.19) + (number_of_cheeseburgers * 1.39);
            System.out.println("Total: " + total);
            double tax = total * 0.05;
            System.out.println("Sales tax: " + tax);
            double total_due = total + tax;
            System.out.println("Total due: " + total_due);
            sum += total_due;
      
            System.out.println("Please enter customer payment:");
            double payment = input.nextDouble();
      
            double change = payment - total_due;
            System.out.println("Customer Change: " + change);
            
            System.out.println("Next Customer? If 'no', ends day."); 
            String nextcustomer = input.next();
            if (nextcustomer.equals("yes")) {
                customers++;
            } else if (nextcustomer.equals("no")) {
                System.out.println(PrintDayTotals(sum, customers));
                break;
            }
        }
    }
    
    public static String PrintDayTotals(double sum, double customers) {
        double average = sum/customers;
        String output = "Total Sales (inc. tax) = " + sum + "%n Total Customers = " + customers + "%n Average Sale Per Customer = " + average;  
        return output;
    }
}

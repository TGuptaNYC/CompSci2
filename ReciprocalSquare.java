package reciprocalsquares;
import java.util.Scanner;
public class ReciprocalSquares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is N?");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double reciprocalsquare = Math.pow((1.0/i), 2);
            sum = sum + reciprocalsquare;
            
        }
        String output = "Pi is ~" + Math.sqrt(6*sum);
        System.out.println(output);
    }
    
}

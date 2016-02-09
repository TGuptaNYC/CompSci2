package factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is n?");
        int n = input.nextInt();
        int product = 1;
        for (int i = 1; i<=n; i++) {
            product*=i;
        }
        System.out.println(product);
    }
    
}

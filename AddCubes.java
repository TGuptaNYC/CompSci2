package addcubes;
import java.util.Scanner;

public class AddCubes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is n?");
        int n = input.nextInt();
        System.out.println(AddCubes(n));
    }
    
    public static double AddCubes(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double cube = Math.pow(i, 3.0);
            sum += cube;
        }
        return sum;
    }
    
}

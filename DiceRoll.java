package diceroll;
public class DiceRoll {

    public static void main(String[] args) {
        int[] counter = new int[13];
        for (int i = 0; i < 1000; i++) {
            counter[diceaddition(2)]++;
        }
    System.out.println("2 = " + counter[2]);
    System.out.println("3 = " + counter[3]);
    System.out.println("4 = " + counter[4]);
    System.out.println("5 = " + counter[5]);
    System.out.println("6 = " + counter[6]);
    System.out.println("7 = " + counter[7]);
    System.out.println("8 = " + counter[8]);
    System.out.println("9 = " + counter[9]);
    System.out.println("10 = " + counter[10]);
    System.out.println("11 = " + counter[11]);
    System.out.println("12 = " + counter[12]);
    }
    
    public static int diceaddition(int a) {
        int[] dices = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            dices[i] = (int)(Math.random()*6 + 1);
            sum += dices[i];
        }
        return sum;
    }
    
    
}

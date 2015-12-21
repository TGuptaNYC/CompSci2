/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrighttriangle;
import javax.swing.JOptionPane;

/**
 *
 * @author david_jordan19
 */
public class MathRightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String side1, side2;
        double side1Double, side2Double, hypotenuse, temp;
        side1 = JOptionPane.showInputDialog(null, "What does side one equal?");
        side2 = JOptionPane.showInputDialog(null, "What does side two equal?");
        side1Double = Double.parseDouble(side1);
        side2Double = Double.parseDouble(side2);
        temp = (side1Double * side1Double) + (side2Double * side2Double);
        hypotenuse = Math.sqrt(temp);
        JOptionPane.showConfirmDialog(null, "Your hypotenuse is: " + hypotenuse);
        
        String tempString = JOptionPane.showInputDialog("Would you like to input the alpha or beta angle?");
        String alphaString, betaString;
        double alpha, beta;
        if (tempString.equals("alpha"))
        {
            alphaString = JOptionPane.showInputDialog(null, "What do you want the value to be?");
            alpha = Double.parseDouble(alphaString);
            beta = 180 - (90 + alpha);
            JOptionPane.showConfirmDialog(null, "Your beta value is: " + beta);
        } else {
            betaString = JOptionPane.showInputDialog(null, "What do you want the value to be?");
            beta = Double.parseDouble(betaString);
            alpha = 180 - (90 + beta);
            JOptionPane.showConfirmDialog(null, "Your alpha value is: " + alpha);
        }
    }
}


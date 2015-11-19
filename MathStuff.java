/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathstuff;

import java.util.Scanner;


/**
 *
 * @author 19guptat
 */
public class MathStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,4));
        System.out.println(Math.abs(a));
        if (a%2 != 0) {
            System.out.println("Odd.");
        } else {
            System.out.println("Even.");
        }
        System.out.println(Math.pow(a,2));
        
        System.out.println("break");
        double b = in.nextDouble();
        int c = in.nextInt();
        if (c < b) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println(c + " is larger.");
        }
        System.out.println(b + c);
        System.out.println(b * c);
        System.out.println(b - c);
        System.out.println(b / c);
        System.out.println(PythagoreanTheorem(b, (double)c));
        
        System.out.println("break");
        double d = in.nextDouble();
        double f = in.nextDouble();
        System.out.println(90 - f);
        double e = d / Math.sin(f);
        double g = Math.sqrt(Math.pow(e, 2) - Math.pow(d, 2));
        System.out.println("Hypo  =" + e);
        System.out.println("Opposite = " + g);
        System.out.println("Proof:" + PythagoreanTheorem(d, g) + " should be close to " + e);
        
        System.out.println("break");
        double h = in.nextDouble();
        System.out.println(2 * Math.PI * h);
        System.out.println(h * 2);
        System.out.println(Math.PI * Math.pow(h, 2));
        
        System.out.println("break");
        String i = in.next();
        double j = in.nextDouble();
        if (i.equals("fahrenheit")) {
            System.out.println((j - 32) * 5/9);
        } else if (i.equals("celsius")) {
            System.out.println(j * 9/5 + 32);
        }
        
        System.out.println("break");
        double k = in.nextDouble();
        double l = in.nextDouble();
        System.out.println(k * l);
        
        System.out.println("break");
        double m = in.nextDouble();
        double n = in.nextDouble();
        double o = in.nextDouble();
        double p = in.nextDouble();
        System.out.println(((m*n)-(o*p))/2);
        
        System.out.println("break");
        double q = in.nextDouble();
        double r = in.nextDouble();
        System.out.println("Growth Rate is " + (r/q-1)*100);
        System.out.println("Second Week = " + (r/q)*r);
        
        System.out.println("break");
        double s = in.nextDouble();
        double t = in.nextDouble();
        System.out.println("BMI = " + ((s*0.454)/Math.pow((t*0.254),2)));
        
        
    }
    
    public static double PythagoreanTheorem(double sidelength01, double sidelength02) {
        double hypo;
        double sidelength01squared = Math.pow(sidelength01, 2);
        double sidelength02squared = Math.pow(sidelength02, 2);
        hypo = Math.sqrt(sidelength01squared + sidelength02squared);
        return hypo;
    }
    
}

package physicsproject;
import java.util.Scanner;
public class PhysicsProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Physics value = new Physics();
        int equals = 0;
        
        int count = 0;
        while (count == 0) {
            
        String originalvelocity;
        int v0;
        System.out.println("Please enter the original velocity or '?' if it is the unknown variable."); 
        originalvelocity = in.next();
        value.setOriginalVelocity(originalvelocity);
                
        String finalvelocity;
        System.out.println("Please enter the final velocity or '?' if it is the unknown variable."); 
        finalvelocity = in.next();
        value.setFinalVelocity(finalvelocity);
        
        String distance;
        System.out.println("Please enter the distance or '?' if it is the unknown variable.");
        distance = in.next();
        value.setDistance(distance);
        
        String time;
        System.out.println("Please enter the time or '?' if it is the unknown variable.");
        time = in.next();
        value.setTime(time);
        
        String acceleration;
        System.out.println("Please enter the accerleration or '?' if it is the unknown variable."); 
        acceleration = in.next();
        value.setAcceleration(acceleration);
        
        if (value.equals != 2) {
            System.out.println("INCORRECT INPUT! Please re-enter.");
        } else {
            count++;
        }
        
        }
        
        
    }
    
}


package physicsproject;

public class Physics {
    private String originalvelocity, finalvelocity, acceleration, distance, time;
    private boolean ov, fv, ac, di, ti;
    private double v0, vf, a, d, t;
    public int equals;
    
    public Physics() {
        
    }
    
    public void setOriginalVelocity(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.ov = false;
        } else {
            this.v0 = Integer.parseInt(b);
            this.ov = true;
        }
    }
    
    public void setFinalVelocity(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.fv = false;
        } else {
            this.vf = Integer.parseInt(b);
            this.fv = true;
        }
    } 
    
    public void setDistance(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.di = false;
        } else {
            this.d = Integer.parseInt(b);
            this.di = true;
        }
    }
    
    public void setTime(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.ti = false;
        } else {
            this.t = Integer.parseInt(b);
            this.ti = true;
        }
    }
    
    public void setAcceleration(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.ac = false;
        } else {
            a = Integer.parseInt(b);
            this.ac = true;
        }
    }
        
    public void findValues() {
        if (ov == true) {
            if (fv = true) {
                if (ti == true) {
                    this.d = 0.5*(v0 + vf) * t;
                    this.a = (vf - v0)/t;
                } else if (ac == true) {
                    this.d = (Math.pow(vf, 2) - Math.pow(v0, 2))/(2*a);
                }             
                
            }
        }
    
    
    }
}

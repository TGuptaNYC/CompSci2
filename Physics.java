package physicsproject;
import java.util.Scanner;
public class PhysicsProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Physics value = new Physics();
        int count = 0;
        while (count == 0) {
            value.equals = 0;
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
                throw new IllegalArgumentException("INCORRECT INPUT! Please re-enter.");
            } else {
                count++;
                value.findValues();
                System.out.println("Initial Velocity = " + value.getInitalVelocity());
                System.out.println("Inital Velocity = " + value.getFinalVelocity());
                System.out.println("Acceleration = " + value.getAcceleration());
                System.out.println("Distance = " + value.getDistance());
                System.out.println("Time = " + value.getTime());
                System.out.println("Would you like to make another calculation? Type 'yes' if so.");
                String xyz = in.next();
                if (xyz.equals("yes")) {
                    count--;
                }
                
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
            this.v0 = Double.parseDouble(b);
            this.ov = true;
        }
    }
    
    public void setFinalVelocity(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.fv = false;
        } else {
            this.vf = Double.parseDouble(b);
            this.fv = true;
        }
    } 
    
    public void setDistance(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.di = false;
        } else {
            this.d = Double.parseDouble(b);
            this.di = true;
        }
    }
    
    public void setTime(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.ti = false;
        } else {
            this.t = Double.parseDouble(b);
            this.ti = true;
        }
    }
    
    public void setAcceleration(String b) {
        if (b.equals("?")) {
            this.equals++;
            this.ac = false;
        } else {
            a = Double.parseDouble(b);
            this.ac = true;
        }
    }
        
    public void findValues() {
        if (ov == true) {
            if (fv = true) {
                if (ac == true) {
                    this.t = (vf - v0)/a;
                    this.d = (Math.pow(vf, 2) - Math.pow(v0, 2))/(2*a);
                } else if (di == true) {
                    this.t = (0.5)*(v0 + vf);
                    this.a = (vf - v0)/t;                  
                } else if (ti == true) {
                    this.a = (vf - v0)/t;
                    this.d = (Math.pow(vf, 2) - Math.pow(v0, 2))/(2*a);
                }
            } else if (ac == true) {
                if (di == true) {
                    this.vf = Math.sqrt(2*a*d+(Math.pow(v0, 2)));
                    this.t = (vf - v0)/a; 
                } else if (ti == true) {
                    this.d = (v0*t) + (0.5)*a*Math.pow(t, 2);
                    this.vf = Math.sqrt(2*a*d+(Math.pow(v0, 2))); 
                }
            } else if (di == true) {
                if (ti == true) {
                    this.vf = (2*d)/t - v0;
                    this.a = (vf - v0)/t;
                }
            }
           
        } else if (fv == true) {
            if (ac == true) {
                if (di == true) {
                    this.v0 = Math.sqrt(-1*(2*a*d-Math.pow(vf, 2)));
                    this.t = (vf - v0)/a;  
                } if (ti == true) {
                    this.v0 = -1*(t*a - vf);
                    this.d = 0.5*(v0+vf)*t;
                }
            } else if (di == true) {
                if (ti == true) {
                    this.v0 = (2*d)/t - vf;
                }
            }
        } else if (ac == true) {
            if (di == true) {
                if (ti == true) {
                    this.v0 = (d - (0.5*a*Math.pow(t, 2)))/t;
                    this.vf = (2*d)/t - v0;
                }
            }
        }
    
    
    }

    public double getInitalVelocity() {
        return this.v0;
    }
    public double getFinalVelocity() {
        return this.vf;
    }
    public double getAcceleration() {
        return this.a;
    }
    public double getDistance() {
        return this.d;
    }
    public double getTime() {
        return this.t;
    }
}

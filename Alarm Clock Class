package alarmclock;

public class alarm {
	private int hours, minutes, seconds;
	private boolean ismilitary; 
        private int ahours, aminutes, aseconds;
        private boolean PMtrue;
        private String message;

	public alarm(int h, int m, int s, boolean b)
		{
                    hours = h;
                    minutes = m;
                    seconds = s;
                    ismilitary = b;
		}
	public void setmilitary(boolean x)
		{
                    ismilitary = x;
		}
        public void settime(int h, int m, int s)
                {
                    hours = h;
                    minutes = m;
                    seconds = s;
                }
        public int gettime()
                {
                    String time;
                    time = Integer.toString(hours) + Integer.toString(minutes) + "." + Integer.toString(seconds);
                    int output = Integer.parseInt(time);
                    return output;
                }
        
        public int getalarm()
                {
                    String time;
                    time = Integer.toString(ahours) + Integer.toString(aminutes) + "." + Integer.toString(aseconds);
                    int output = Integer.parseInt(time);
                    return output;
                }
        public void setalarm(int ah, int am, int as, boolean afternoon)
                {
                    ahours = ah;
                    aminutes = am;
                    aseconds = as;
                    PMtrue = afternoon;            
                }
        
        public void setmessage(String msg)
                {
                    message = msg;
                }
        
        public String getmessage()
                {
                    return message;
                }
        public void setsnooze(int min)
                {
                    aminutes = aminutes + min;
                }
            
	}

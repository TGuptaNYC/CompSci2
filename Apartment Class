package apartmentbuilding;

public class Apartment extends Building {
    private int rooms, occupants, rent, floor;
    private boolean ac;
    
    public Apartment()
        {
            rooms = 4;
            occupants = 2;
            setRent();
            floor = 3;
            ac = true;
        }
    
    public Apartment(int r, int o, int f, boolean c)
        {
            setRooms(r);
            setOccupants(o);
            setRent();
            floor= f;
            ac = c;
        }
    
    public void setRent()
        {
            if (ac == true)
                {
                    rent = rooms*occupants+200;
            } else
                {
                    rent = rooms*occupants -100;
            }
        }
    public int getRent()
        {
            return rent;
        }
    public void setRooms(int a)
        {
            if (1 <= a && a <= 5) {
                rooms = a;
                setRent();
                } else {
                throw new IllegalArgumentException("Number of rooms must be between 1 and 5.");
            }
        }
    public int getRooms()
        {
            return rooms;
        }
    public void setOccupants(int a)
        {
            if (1 <= a && a <= 10) {
                occupants = a;
                setRent();      
            } else {
                throw new IllegalArgumentException("Number of occupants must be between 1 and 10.");
            }
        }
    public int getOccupants()
        {
            return occupants;
        }
    
    public void setFloor(int a)
        {
            floor = a;
        }
    public int getFloor()
        {
            return floor;
        }
    public void setAC(boolean a)
        {
            ac = a;
            setRent();
        }
    public boolean getAC()
        {
            return ac;
        }
}

package drug.store;
import java.util.*;
public class Inventory 
{
    private String owner;
    private int phonenumber;
    private Item[] items;
    private int itemnumber;
    
    public Inventory() 
    {
         this.items = new Item[1000];
         this.itemnumber = 0;
         this.owner = "TG";
         this.phonenumber = 1234567890;
    }
    
    public void AddItems(Item a) 
    {
        this.items[itemnumber] = a;
        this.itemnumber++;
    }
    
    public String SearchItems(String a) 
    {
        for (int clock = 0; clock < this.itemnumber; clock++) 
        {
            if (a.equals(this.items[clock].getDescription())) 
            {
                return this.items[clock].getDetails();
            }
                
        }
        return null;
    }
    
    public String BuyItems(String a, int b) 
    {
        for (int clock = 0; clock < this.itemnumber; clock++) 
        {
            if (a.equals(this.items[clock].getDescription())) 
            {
                if (b <= this.items[clock].getQuantity()) 
                {
                    this.items[clock].setQuantity(this.items[clock].getQuantity() - b);
                    return "Item " + this.items[clock].getDescription() + "has been bought.";
                }
                else 
                {
                    return "Not enough " + this.items[clock].getDescription() + "in stock. Item not bought. We apologize for this inconvenience.";        
                }
            }         
        }
        return null;
    }
    
    public void RemoveItems(String a) 
    {
        for (int clock = 0; clock < this.itemnumber; clock++)
        {
            if (a.equals(this.items[clock].getDescription())) 
            {
                this.items[clock] = null;
            }
        }
    }
}

package drug.store;
public class Item {
  private String description;
  private double buyerprice;
  private double salesprice;
  private int quantity;
  
  public Item(String description, double buyer_price, double sales_price, int quantity) {
    this.description = description;
    this.buyerprice = buyerprice;
    this.salesprice = salesprice;
    this.quantity = quantity;
  }
  
  public String getDescription() {
      return this.description;
  }
  
  public double getBuyerPrice() {
      return this.buyerprice;
  }
  
  public double getSalesPrice() {
      return this.salesprice;
  }
  
  public int getQuantity() {
      return this.quantity;
  }
  
  public void setQuantity(int quantity) {
      this.quantity = quantity;
  }
  
  public String getDetails() {
      String details = "Item " + this.description + ":" + System.lineSeparator() + "Buyer Price: $" + this.buyerprice + System.lineSeparator() + "Sales Price: $" + this.salesprice + System.lineSeparator() + "Quantity: " + this.quantity;
      return details;
  }
}  

package drug.store;
import java.util.*;

public class DrugStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int clock = 0;
        Inventory a = new Inventory();
        while (clock == 0) {
            int operation = 0;
            System.out.println("What operation would you like to perform?" + System.lineSeparator() + "Type 1 to ADD AN ITEM" + System.lineSeparator() + "Type 2 to SEARCH ITEMS" + System.lineSeparator() + "Type 3 to BUY AN ITEM" + System.lineSeparator() + "Type 4 to REMOVE AN ITEM FROM THE INVENTORY");
            operation = input.nextInt();
            if (operation == 1) 
            {
                System.out.println("You are adding an item.");
                System.out.println("What is the item's name?");
                String name = input.next();
                System.out.println("What is the buyer price? [Only numbers please]");
                double buyerprice = input.nextDouble();
                System.out.println("What is the sell price? [Only numbers please]");
                double sellprice = input.nextDouble();
                System.out.println("What is the quantity? [Only numbers please]");
                int quantity = input.nextInt();
                Item firstitem = new Item(name, buyerprice, sellprice, quantity);
                System.out.println(a.AddItems(firstitem));
            }
            else if (operation == 2) 
            {
                System.out.println("You are searching items.");
                System.out.println("What item do you want to search for?");
                String itemsearch = input.next();
                System.out.println(a.SearchItems(itemsearch));
            }
            else if (operation == 3)
            {
                System.out.println("You are buying an item.");
                System.out.println("What item are you buying?");
                String buyingitem = input.next();
                System.out.println("How many of the item are you buying?");
                int numberbuying = input.nextInt();
                System.out.println(a.BuyItems(buyingitem, numberbuying));
            }
            else if (operation == 4)
            {
                System.out.println("You are removing an item from the inventory.");
                System.out.println("What item do you want to remove?");
                String removingitem = input.next();
                System.out.println(a.RemoveItems(removingitem));
            }
            else {
                System.out.println("Illegal input.");
                clock++;
            }
            System.out.println("Do you want to perform another operation? Type y for YES and n for NO." + System.lineSeparator() + "Warning: Inputing n WILL delete your inventory.");
            String yesorno = input.next();
            if (yesorno.equals("n")) {
                clock++;
            }
            
        }
        
    }
    
}

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
    
    public String AddItems(Item a) 
    {
        this.items[itemnumber] = a;
        this.itemnumber++;
        return "Item added.";
    }
    
    public String SearchItems(String a) 
    {
        //System.out.println(this.itemnumber);
        for (int clock = 0; clock <= this.itemnumber; clock++) 
        {
            //System.out.println(this.items[clock].getDescription());
            if (this.items[clock].getDescription().equals(a)) 
            {
                return this.items[clock].getDetails();
            }
     
        }
        return null;
    }
    
    public String BuyItems(String a, int b) 
    {
        for (int clock = 0; clock <= this.itemnumber; clock++) 
        {
            if (a.equals(this.items[clock].getDescription())) 
            {
                if (b <= this.items[clock].getQuantity()) 
                {
                    this.items[clock].setQuantity(this.items[clock].getQuantity() - b);
                    return "Item " + this.items[clock].getDescription() + " has been bought.";
                }
                else 
                {
                    return "Not enough " + this.items[clock].getDescription() + " in stock. Item not bought. We apologize for this inconvenience.";        
                }
            }         
        }
        return null;
    }
    
    public String RemoveItems(String a) 
    {
        for (int clock = 0; clock < this.itemnumber; clock++)
        {
            if (a.equals(this.items[clock].getDescription())) 
            {
                this.items[clock] = null;
                return "Item removed.";
            }
        }
        
        return null;
    }
}

package drug.store;
public class Item {
  private String description;
  private double buyerprice;
  private double salesprice;
  private int quantity;
  
  public Item(String description, double buyer_price, double sales_price, int quantity) {
    setDescription(description);
    setBuyerPrice(buyer_price);
    setSalesPrice(sales_price);
    setQuantity(quantity);
  }
  
  public void setDescription(String a) {
      description = a;
  }
  
  public String getDescription() {
      return this.description;
  }
  
  public void setBuyerPrice(double a) {
      buyerprice = a;
  }
  public double getBuyerPrice() {
      return this.buyerprice;
  }
  
  public void setSalesPrice(double a) {
      salesprice = a;
  }
  
  public double getSalesPrice() {
      return this.salesprice;
  }
    
  public void setQuantity(int a) {
      quantity = a;
  } 
  
  public int getQuantity() {
      return this.quantity;
  }
  

  
  public String getDetails() {
      String details = "Item " + description + "-" + " " + "Buyer Price: $" + buyerprice + " " + "Sales Price: $" + salesprice + " " + "Quantity: " + quantity;
      return details;
  }
}  

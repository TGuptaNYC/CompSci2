package storefront;

public class Store {
    private String[] items;
    private String owner;
    private int phonenumber;
    
    public Store(){
        this.items = new String[3];
        this.items[0] = "meth";
        this.items[1] = "75";
        this.items[2] = "100";
        this.owner = "SallyJoeBob";
        this.phonenumber = 8675309;
    }
    
    public Store(String[] items, String owner, int phonenumber) {
        this.items = items;
        this.owner = owner;
        this.phonenumber = phonenumber;
    }
    
    public void SetItems(String[] items) {
        this.items = items;
    }
    
    public String[] GetItems() {
        return this.items;
    }
    
    public void SetOwner(String owner) {
        this.owner = owner;
    }
    
    public String GetOwner() {
        return this.owner;
    }
    
    public void SetPhoneNumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public int GetPhoneNumber() {
        return this.phonenumber;
    }
    
    
}

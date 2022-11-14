public class Item {
    private int ID;
    private String name;
    private double price;
    private int quantity;
    public Item(int id, String n, double p, int q){
        this.ID = id;
        this.name = n;
        this.price = p;
        this.quantity = q;
    }
    public void setID(int i){
        this.ID = i;
    }
    public void setName(String na){
        this.name = na;
    }
    public void setPrice(double pr){
        this.price = pr;
    }
    public void setQuantity(int qu){
        this.quantity = qu;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class Inventory {
    ArrayList<Item> inventory = new ArrayList<Item>();
    
    public Inventory() {
        addTestValues();
    }

    public ArrayList<Item> getAllItems() {
        return inventory;
    }
    public void reduceQuantity(int id, int q){
        int newVal;
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).getID() == id){
                newVal = inventory.get(i).getQuantity()-q;
                inventory.get(i).setQuantity(newVal);
            }
        }
        
    }
    private void addTestValues() {
        inventory.add(new Item(10000, "Sleep in Safety - 45 Grave Vinyl", 19.95, 30));
        inventory.add(new Item(20000, "Christian Death - Catastrophe Ballet Vinyl", 15.95, 20));
        inventory.add(new Item(30000, "Kommunity FK - The Vision and the Video Vinyl", 17.95, 30));
        inventory.add(new Item(40000, "Voodoo Church - Voodoo Church Vinyl", 19.95, 30));
        inventory.add(new Item(50000, "Children on Stun - Tourniquets of Love Vinyl", 19.95, 15));
        inventory.add(new Item(60000, "Screams for Tina - Strobelight Funeral Vinyl", 14.95, 8));
        inventory.add(new Item(70000, "Killing Joke - Killing Joke Vinyl", 21.95, 3));
        inventory.add(new Item(80000, "Alien Sex Fiend 13 Head t-shirt Size: XL", 24.95, 5));

    }

}

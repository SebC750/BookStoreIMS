public class Transaction {

    private int transactionID;
    private Item purchasedItem;
    private int quantity;
    public Transaction(int i, Item pi, int q){
          this.transactionID = i;
          this.purchasedItem = pi;
          this.quantity = q;
    }
    public void setTransactionID(int id){
          this.transactionID = id;
    }
    public void setPurchasedItem(Item it){
          this.purchasedItem = it;
    }
    public void setQuantity(int qu){
          this.quantity = qu;
    }
    public int getTransactionID(){
        return transactionID;
    }
    public Item getPurchasedItem(){
        return purchasedItem;
    }
    public int getQuantity(){
        return quantity;
    }

}

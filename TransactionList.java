import java.util.ArrayList;

public class TransactionList {
    ArrayList<Transaction> listOfTransactions;
    public TransactionList(){
          listOfTransactions = new ArrayList<Transaction>();
          addTestValues();
    }
    public void addTestValues(){
        listOfTransactions.add(new Transaction(00000,new Item(10000, "Sleep in Safety - 45 Grave Vinyl", 19.95, 30),1));
        listOfTransactions.add(new Transaction(10000,new Item(70000, "Killing Joke - Killing Joke Vinyl", 21.95, 3),1));
    }
}

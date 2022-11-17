import java.util.ArrayList;
import java.util.Random;
public class Employee extends User{
    ArrayList<User> employeeList = new ArrayList<User>();
    private int userID;
    public Employee(String nameIn, String passwordIn, int u){
        super(nameIn,passwordIn);       
        this.userID = u;       
        
    }
    
   public int getUserID(){
    return userID;
}
    public void addTestValues(){
        employeeList.add(new Employee("admin", "1234", 3920));
    }
}

import java.util.ArrayList;

public class Employee extends User{
    ArrayList<User> employeeList = new ArrayList<User>();
    public Employee(String nameIn, String passwordIn, String userType){
        super(nameIn,passwordIn);
        userType = "Employee";
    }

    public void addTestValues(){
        
    }
}

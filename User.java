import java.util.Random;

public class User {
    private int userID;
    private String name;
    private String password;
    
    public User(String n, String p){
          this.userID = new Random().nextInt(100);
          this.name = n;
          this.password = p;
    }
    public void setUserID(int us){
         this.userID = us;
    }
    public void setName(String n){
         this.name = n;
    }
    public void setPassword(String p){
         this.password = p;
    }
    public int getUserID(){
        return userID;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
}

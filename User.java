import java.util.Random;

public class User {
    
    private String name;
    private String password;
    
    public User(String n, String p){
          
          this.name = n;
          this.password = p;
    }
    
    public void setName(String n){
         this.name = n;
    }
    public void setPassword(String p){
         this.password = p;
    }
    
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
}

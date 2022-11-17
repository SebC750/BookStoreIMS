import java.sql.*;

import javax.management.Query;
public class index {

	public static void main(String[] args) {

		//Driver code to run the program.
		//-----------------------------------------------------------------//
		
        LogInFrame logIn = new LogInFrame();
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root","root");
		Statement query = connectToDB.createStatement();
		ResultSet retrievedData = query.executeQuery("select * from item");
		while(retrievedData.next()){
			System.out.println(retrievedData.getString(1));
		}
		connectToDB.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
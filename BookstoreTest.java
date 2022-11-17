import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.*;

import org.junit.Test;

public class BookstoreTest {

    @Test
    public void returnTransactionData() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root",
                "root");
        Statement query = connectToDB.createStatement();
        ResultSet retrievedData = query.executeQuery("select * from transactions");
        while (retrievedData.next()) {
            assertNotNull(retrievedData.getString(1));
        }

        connectToDB.close();

    }

    @Test
    public void returnEmployeeData() {
        Employee newEmp = new Employee("John", "1234", 49032);
        assertEquals("John", newEmp.getName());
        assertEquals("1234", newEmp.getPassword());
        assertEquals(49032, newEmp.getUserID());
    }

    @Test
    public void returnInventoryData() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root",
                "root");
        Statement query = connectToDB.createStatement();
        ResultSet retrievedData = query.executeQuery("select * from item");
        while (retrievedData.next()) {
            assertNotNull(retrievedData.getString(1));
        }

        connectToDB.close();

    }
    @Test
    public void returnStatsData() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root",
                "root");
        Statement query = connectToDB.createStatement();
        ResultSet retrievedData = query.executeQuery("select * from stats");
        while (retrievedData.next()) {
            assertNotNull(retrievedData.getString(1));
        }

        connectToDB.close();

    }
}

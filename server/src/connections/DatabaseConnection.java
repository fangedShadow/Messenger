/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connections;
import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseConnection {
  
    public static Connection connection;


   
	
	public static void connect() {
		try {
                    
                    // Your connection logic here
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/messenger?serverTimezone=EST", "root", "BP18singh$02");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connections.DatabaseConnection;
import java.util.Scanner;

/**
 *
 * @author bhavp
 */
public class main {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DatabaseConnection.connect();
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.println("1: View Movies");
//		System.out.println("2: Add Movie");
//		System.out.println("3: Update Movie");
//		System.out.println("4: Delete Movie");
//                adduser();
//               getuser();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frame().setVisible(true);
            }
        });
    }
    public static void getuser() {
        try {
            Connection connection = DatabaseConnection.connection;
            String query = "SELECT * FROM User";
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(query);

            while (result.next()) {
                System.out.println("Movie ID: " + result.getString("userName"));
                System.out.println("Movie Name: " + result.getString("password"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void adduser() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter name: ");
		String userName = keyboard.next();
		System.out.println("ENTER pasword: ");
		String password = keyboard.next();
		try {
			Connection connection = DatabaseConnection.connection;
			String query = "INSERT INTO User VALUES (1,?, ?)";
			PreparedStatement stm = connection.prepareStatement(query);
			stm.setString( 1, userName);
			stm.setString(2, password);
			stm.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	} 
    
}

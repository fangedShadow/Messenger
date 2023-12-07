package com.raven.model;
import connections.DatabaseConnection;
import java.beans.Statement;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageHistoryManager {
    private static final String FILE_PATH = "message_history.txt";

    public static void saveMessage(Model_Receive_Message message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // Append the message details to the file
            writer.write(message.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception according to your application's error handling strategy
        }
    }

    public static void loadMessageHistory() throws SQLException {
        Connection con = DatabaseConnection.getInstance().getConnection(); // Handle the exception according to your application's error handling strategy
        String SELECT_MESSAGES_QUERY = null;
        try (java.sql.Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_MESSAGES_QUERY)) {
            
            while (resultSet.next()) {
                // Retrieve message details from the result set
                int messageId = resultSet.getInt("MessageID");
                int fromUserId = resultSet.getInt("FromUserID");
                int toUserId = resultSet.getInt("ToUserID");
                int messageType = resultSet.getInt("MessageType");
                String text = resultSet.getString("Text");
                System.out.println("Message ID: " + messageId + ", FromUserID: " + fromUserId +
                        ", ToUserID: " + toUserId + ", MessageType: " + messageType + ", Text: " + text);
            }
        }
    }
}

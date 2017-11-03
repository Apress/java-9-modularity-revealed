package com.apress.databasepersistence;

import com.apress.service.interfaces.*;
import java.sql.*;

public class DatabasePersistenceProvider implements DatabasePersistenceService {

    private Connection connection;
    private static final String JDBC_URL = "jdbc:postgresql://localhost/myDatabase";

    public void saveMessageIntoDatabase(String message) {

        String insertSql = "INSERT INTO MESSAGES(CONTENT) VALUES(" + message + ")";

        try {
            connection = DriverManager.getConnection(JDBC_URL, "root", "password");
            Statement statement = connection.createStatement();

            int result = statement.executeUpdate(insertSql);
            if (result > 0) {
                System.out.println("Message successfully saved into the database");
            } else {
                System.out.println("Message could not be saved into the database");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
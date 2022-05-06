package com.revature.Exercises;

import java.sql.*;

public class JDBCExercise {
    public static void main(String[] args) throws SQLException {
        // Step 1: Load driver
        // Class.forName("jdbc:mysql://localhost"); // Not needed

        // Step 2: Create connection object
        String url = "jdbc:mysql://localhost:3306/revature";
        String userName = "root";
        String password = System.getenv("mysql_pass"); // your password
        Connection connection = DriverManager.getConnection(url, userName, password);

        // Step 3: Create statement object
        Statement statement = connection.createStatement();

        // Step 4: Execute Query
        // INSERT
        int id = 4;
        String name = "John";
        String email = "J@gmail.com";
        String sql = "INSERT INTO employee VALUES (" + id + ", '" + name + "', '" + email + "')";
        int rows = statement.executeUpdate(sql);
        System.out.println("(" + rows + ") rows effected");

        // SELECT
        String select = "SELECT * FROM employee";
        ResultSet resultSet = statement.executeQuery(select);
        while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt(1) + ", Name: " + resultSet.getString(2) +
                    ", Email: " + resultSet.getString(3));
        }
        // DELETE
        sql = "DELETE FROM employee WHERE ID > 10";
        rows = statement.executeUpdate(sql);
        System.out.println("(" + rows + ") rows effected");

        // UPDATE
        sql = "UPDATE employee SET name = 'Carl', email = 'C@gmail.com' WHERE id = 2";
        rows = statement.executeUpdate(sql);
        System.out.println("(" + rows + ") rows effected");

        resultSet = statement.executeQuery(select);
        while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt(1) + ", Name: " + resultSet.getString(2) +
                    ", Email: " + resultSet.getString(3));
        }

        // Step 5: close the connection
        connection.close();
    }
}

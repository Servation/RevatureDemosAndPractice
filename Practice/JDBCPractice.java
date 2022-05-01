package com.revature.Practice;


import java.sql.*;

public class JDBCPractice {
    public static void main(String[] args) {

        String password = System.getenv("mysql_pass");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from engineeringstudent");
            System.out.println("--Students--");
            while (resultSet.next()) {
                System.out.print("Name: ");
                System.out.println(resultSet.getString("First_Name") +" "+ resultSet.getString("Last_Name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

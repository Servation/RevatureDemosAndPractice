package com.revature.Practice;


import java.sql.*;
import java.util.Map;
import java.util.Properties;

public class JDBCPractice {
    public static void main(String[] args) {
        Map<String, String> p = System.getenv();
        for (String envName : p.keySet()) {
            System.out.format("%s=%s%n", envName, p.get(envName));
        }
        System.out.println(p);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "apples123");
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

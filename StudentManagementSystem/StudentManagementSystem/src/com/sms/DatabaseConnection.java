package com.sms;

import java.sql.*;

public class DatabaseConnection {

    private static Connection conn = null;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}

package com.springboot.app;

import java.sql.*;

public class PreparedStatementDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
//        Unnecessary since JDBC 4.0
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            preparedStatement = conn.prepareStatement("select * from world.city where CountryCode = ? and Population > ?");
            preparedStatement.setString(1, "AFG");
            preparedStatement.setInt(2, 150000);
            rs = preparedStatement.executeQuery();
            while(rs.next()) {
//                System.out.print("Id: " + rs.getString(1) + ", ");
//                System.out.print("Name: " + rs.getString(2) + ", ");
//                System.out.print("CountryCode: " + rs.getString(3) + ", ");
//                System.out.print("District: " + rs.getString(4) + ", ");
//                System.out.println("Population: " + rs.getInt(5));
                System.out.print("Id: " + rs.getString("ID") + ", ");
                System.out.print("Name: " + rs.getString("Name") + ", ");
                System.out.print("CountryCode: " + rs.getString("CountryCode") + ", ");
                System.out.print("District: " + rs.getString("District") + ", ");
                System.out.println("Population: " + rs.getInt("Population"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}

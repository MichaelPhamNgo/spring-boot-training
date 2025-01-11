package com.springboot.app;

import java.sql.*;

public class BatchDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement("insert into world.city (Name, CountryCode, District, Population) values ('Dummy Name', 'AFG', 'Dummy District', ?)");
            for(int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i * 100000);
                preparedStatement.addBatch();
            }
            int[] rowsUpdatedArray = preparedStatement.executeBatch();
            conn.commit();
            for(int i: rowsUpdatedArray) {
                System.out.println(i + " rows updated");
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

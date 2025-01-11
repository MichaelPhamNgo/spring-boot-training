package com.springboot.app;

import java.sql.*;

public class CallableStatementDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement callableStatement = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            callableStatement = conn.prepareCall("{call number_of_cities_for_country(?, ?)}");
            callableStatement.setString(1, "AFG");
            callableStatement.registerOutParameter(2, Types.INTEGER);
            callableStatement.execute();
            System.out.println(callableStatement.getInt(2));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(callableStatement != null) {
                try {
                    callableStatement.close();
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

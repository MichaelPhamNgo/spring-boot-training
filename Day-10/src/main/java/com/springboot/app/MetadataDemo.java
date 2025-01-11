package com.springboot.app;

import java.sql.*;

public class MetadataDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Connection conn = null;
        DatabaseMetaData metaData = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            metaData = conn.getMetaData();
            rs = metaData.getTables(null, "dsfadfsafsd" , null, new String[]{"TABLE"});
            while(rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}

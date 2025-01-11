package com.springboot.app;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.*;

public class JdbcConnectionPoolExample {
    public static ComboPooledDataSource getDataSource() {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setJdbcUrl("jdbc:mysql://localhost/day13");
        cpds.setUser("admin");
        cpds.setPassword("123456");

        cpds.setInitialPoolSize(5);
        cpds.setMinPoolSize(5);
        cpds.setAcquireIncrement(5);
        cpds.setMaxPoolSize(20);
        cpds.setMaxStatements(100);

        return cpds;
    }

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            ComboPooledDataSource dataSource = JdbcConnectionPoolExample.getDataSource();
            connection = dataSource.getConnection();
            pstmt = connection.prepareStatement("SELECT * FROM world.city where CountryCode='AFG'");

            resultSet = pstmt.executeQuery();
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(2) + "," + resultSet.getString(3) + "," + resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}

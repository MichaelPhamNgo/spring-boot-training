import java.sql.*;

public class ExecuteDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
        executeDemo();
//        executeUpdateDemo();
    }

    public static void executeDemo() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            preparedStatement = conn.prepareStatement("select * from world.city where CountryCode = ? and Population > ?");
            preparedStatement.setString(1, "AFG");
            preparedStatement.setInt(2, 150000);
            boolean hasResultSet = preparedStatement.execute();
            if(hasResultSet) {
                rs = preparedStatement.getResultSet();
                while (rs.next()) {
                    System.out.print("Id: " + rs.getString("ID") + ", ");
                    System.out.print("Name: " + rs.getString("Name") + ", ");
                    System.out.print("CountryCode: " + rs.getString("CountryCode") + ", ");
                    System.out.print("District: " + rs.getString("District") + ", ");
                    System.out.println("Population: " + rs.getInt("Population"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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

    public static void executeUpdateDemo() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // original value = 1780000;
            preparedStatement = conn.prepareStatement("update world.city set Population = ? where ID=?");
            preparedStatement.setInt(1, 1000000);
            preparedStatement.setInt(2, 1);
            int rowsChanged = preparedStatement.executeUpdate();
            System.out.println(rowsChanged + " rows changed");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
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

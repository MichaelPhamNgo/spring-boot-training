import java.sql.*;

public class StatementDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
//        Unnecessary since JDBC 4.0
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = conn.createStatement();
            String query = "select * from world.city where CountryCode = 'AFG'";
            rs = statement.executeQuery(query);
            while(rs.next()) {
                System.out.print("Id: " + rs.getString(1) + ", ");
                System.out.print("Name: " + rs.getString(2) + ", ");
                System.out.print("CountryCode: " + rs.getString(3) + ", ");
                System.out.print("District: " + rs.getString(4) + ", ");
                System.out.println("Population: " + rs.getInt(5));
//                System.out.print("Id: " + rs.getString("ID") + ", ");
//                System.out.print("Name: " + rs.getString("Name") + ", ");
//                System.out.print("CountryCode: " + rs.getString("CountryCode") + ", ");
//                System.out.print("District: " + rs.getString("District") + ", ");
//                System.out.println("Population: " + rs.getInt("Population"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
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

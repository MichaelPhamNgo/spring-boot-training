import java.sql.*;

public class TransactionDemo {
    private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/world";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void main(String[] args) {
        withTransaction();
    }

    public static void withoutTransaction() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // original value = 1780000;
            preparedStatement = conn.prepareStatement("update world.city set Population = ? where ID=?");
            preparedStatement.setInt(1, 1000000);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
            if(true) {
                throw new SQLException();
            }
            preparedStatement.setInt(1, 1780000);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
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


    // transaction {a, b, c}
    public static void withTransaction() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // starting point
            conn.setAutoCommit(false);
            // original value = 1780000;
            preparedStatement = conn.prepareStatement("update world.city set Population = ? where ID=?");
            preparedStatement.setInt(1, 1000000);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
            if(true) {
                throw new SQLException();
            }

            preparedStatement.setInt(1, 1780000);
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();

            // 2 ending point
            conn.commit();
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

package database;

import java.sql.*;

public class Transaction {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);

            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name,student_class) VALUES (?,?)");
            pr.setInt(2,5);
            pr.setString(1,"Harry");
            pr.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            pr.setInt(2,5);
            pr.setString(1,"Ron");
            pr.executeUpdate();

            connect.commit();
            connect.close();
        } catch (SQLException ex) {
            try {
                if (connect != null) {
                    connect.rollback();
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package database;

import java.sql.*;

public class DeleteProcess {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            st.executeUpdate(sql);

            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setInt(1,3);
            prSt.setString(1,"Faki");

            st.close();
            connect.close();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

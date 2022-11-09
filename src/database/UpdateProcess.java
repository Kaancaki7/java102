package database;

import java.sql.*;

public class UpdateProcess {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String stSql = "UPDATE student SET student_name='Kaan' WHERE student_id=1";
        String prSql = "UPDATE student SET student_name=? WHERE student_id=?";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            //Statement'ta yine yukarıdaki gibi elmizle güncelledik 1. id'deki öğrenciyi Kaan yaptık.
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);

            //prepared ile 1. indeksteki kişinin isminive sınıfını güncelledik.
            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1,"Faki Kaan");
            pr.setInt(1,1);

            st.close();
            connect.close();
            pr.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

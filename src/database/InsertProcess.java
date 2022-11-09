package database;

import java.sql.*;

public class InsertProcess {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Kaan',4)";
        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            //statement üzerinden veri tabanına veri ekledik. yorum satırlı olan kısım normal statementla veri ekleme
            //yapabildiğimiz kısım birde preparedStatement var bu daha kullanışlı.
            //Statement st = connect.createStatement();
            //st.executeUpdate(insertSql);

            //sour işaretli olan kısımlara aşağıdaki gibi değer atıyoruz.
            //kullanıcıdan değer atmasını istersek mesela kullanışlı oluyor.
            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setInt(2,4);
            prSt.setString(1,"Kaan");
            prSt.executeUpdate();

            prSt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

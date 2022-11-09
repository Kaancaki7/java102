package database;

//VERİ TABANINA BAĞLANMAMIZIN 2. YOLU VE BENCE DAHA KULLANIŞLI YOLU.

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM student";

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            //Burada veritabanından veri çekmeye çalışıyoruz sql',n içindeki komut sql komutudur.
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                //isimlerini ve veri tiplerini ne belirlediysen onlarla çekebiliyorsun.
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("Name : " + data.getString("student_name"));
                System.out.println("Class : " + data.getInt("student_class"));
                System.out.println("-----------------------------------------------------");
            }

            connect.close();
            data.close();
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

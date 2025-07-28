package airlines_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection connectDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ Specify port 3307 and use 127.0.0.1 instead of localhost
            String url = "jdbc:mysql://127.0.0.1:3307/airdata?useSSL=false";
            String user = "root";
            String pass = "1234";

            Connection connect = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully."); // Optional debug message
            return connect;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

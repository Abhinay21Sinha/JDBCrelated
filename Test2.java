import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Test2 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
            Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            if(!com.isClosed())
                System.out.println("connection is estabilished");
        }catch(SQLException d){
            System.out.println("connection is not estabilished");
        }
    }
}

package bank_management_system;
import java.sql.*;
public class Conn {
    //5 steps for jdbc connection
    //step 1:Register the driver
    //step 2:Create Connection
    //step 3:Create Statement
    //step 4:Execute Query
    //step 5:Close Connection
    Connection c;
    Statement s;
    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:/// bankmanagementsystem","root","niharika@123");
            s = c.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }
    }

}

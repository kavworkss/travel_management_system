package travel.management.system;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn(){
        //register the driver
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","root");//creating connection
           s=c.createStatement();//creating statement
           
           
       } catch(Exception e){
           e.printStackTrace();
       }
    }
}
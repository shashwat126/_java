
package jdbc;
import java.sql.*;
import java.lang.*;

public class Jdbc {

    public static void main(String[] args) {
        
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","123456");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select *from deatil");
        while(rs.next())
            System.out.print(rs.getString(1)+" "+ rs.getString(2)+ " "+" \n");
            con.close();
            
    }catch(Exception e){
        System.out.println(e);
    }
      
    
    }
    
}

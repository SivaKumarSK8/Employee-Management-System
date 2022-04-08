package Employeee;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 

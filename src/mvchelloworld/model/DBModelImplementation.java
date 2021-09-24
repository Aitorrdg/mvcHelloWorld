/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zeeshan,Aitor
 */
public class DBModelImplementation implements Model{
    private Connection con;
    private PreparedStatement stmt;
    private DBConnection connection;
   /**
    * 
    * @return here this method will fetch the greeting from database.
    */
    @Override
    public String getGreeting() {
        ResultSet rs;
        connection=new DBConnection();
        String greeting=null;
        try {
            con=connection.openConnection();
            stmt=con.prepareStatement("select greeting from greeting.greeting_value");
            rs=stmt.executeQuery();
            if(rs.next()){
                greeting=rs.getString(1);
            }
            rs.close();
            connection.closeConnection(stmt, con);
        } catch (SQLException ex) {
            Logger.getLogger(DBModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return greeting;
    }
    
}

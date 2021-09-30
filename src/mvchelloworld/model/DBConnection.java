/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchelloworld.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Zeeshan,Aitor
 */
/**
 * Class that manage DB connection.
 */

public class DBConnection {

    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    /**
     * We read the values from DB proprties file which will be used to connect us with the database.
     */
    public DBConnection() {
        configFile = ResourceBundle.getBundle("mvchelloworld.model.greetingDB");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");

    }

    /**
     *
     * @return After getting connected with database this method is use to open connection
     * @throws SQLException
     */
    public Connection openConnection() throws SQLException {
        Connection con;
        con = DriverManager.getConnection(url, user, pass);
        return con;
    }

    /**
     *
     * @param stmt
     * @param con
     * @throws SQLException
     * 
     * Ater making the query this method is used to close the connection
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
}    

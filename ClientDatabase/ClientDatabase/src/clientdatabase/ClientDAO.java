/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 75065006
 */
public class ClientDAO {

    /**
     * @param args the command line arguments
     */
    String connectionString="jdbc:mysql://localhost:3306/Contatti?user=root&password=secret";
    
    public void connessione() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            // gestione dell'eccezione
        }
        Connection connection = DriverManager.getConnection(connectionString);
    }
    
    public boolean login(){
        
    }
}

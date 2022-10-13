/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author ASUS
 */
import java.sql.* ; 
import javax.swing.JOptionPane;
public class ConnectionBd {
    static Connection connection = null ; 
    public static Connection getconnection(){
        if (connection==null)
        {           
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","system");           
                return connection ;                
            
        } catch (SQLException ex) {
            ex.printStackTrace();
       JOptionPane.showMessageDialog(null, "connexion echoué :  "+ex.getMessage());
       return null ; 
      
        }
        }
        else {
        return connection ; 
                }
        
    }
    
    
    
   
}


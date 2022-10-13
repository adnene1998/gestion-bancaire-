/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.sql.*;  
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class teste_requete {
public static void main(String[] args)throws Exception {
      Statement stmt;
       ResultSet rs ;
       String query = ("SELECT cin,nom FROM users.client ") ;
   stmt  = ConnectionBd.getconnection().createStatement() ; 
      rs = stmt.executeQuery(query);
         ArrayList<String> client  = new ArrayList<String>();
           client.add("client 1 "); 
         client.add("client 2") ;
         ResultSetMetaData rsmd=rs.getMetaData();  
         System.out.println("Total columns: "+rsmd.getColumnCount());  
         
        int nb =0 ; 
      while (rs.next()){
          System.out.println(rs.getString(1));
      client.add(rs.getString(1)) ; 
      nb++ ;
      }
      System.out.println("le nombre de ligne est "+nb);
      
   // for (int i = 0; i < client.size(); i++) {
      //System.out.println(client.get(i));
    //}
          
    
   
  
    
 
            
            
            
            
            
            
    
    
           
           }
            
}

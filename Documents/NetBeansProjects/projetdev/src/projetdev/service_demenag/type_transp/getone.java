/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetdev.service_demenag.type_transp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rahil
 */
public class getone {
    
}
@Override
    public Type_service_demenag getOne(int id) {
         
        String rep = "SELECT * FROM type_service_demenag WHERE `id_service_demenag`="+id;
      Type_service_demenag sd =new Type_service_demenag();
        Statement stm; 
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);              
            System.err.println("je suis ici");
            while (rs.next()) { 
                
                
                sd.setId_service_demenag(rs.getInt(1));
                sd.setType_demenag(rs.getString(2));
                sd.setDuree_service_demenag(rs.getString(3));
           
             
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
           return sd;   
            }
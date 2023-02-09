/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.entities.Type_service_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 *
 * @author Rahil
 */
public class Service_type_service_demenag implements  IService_demenag<Type_service_demenag>
{
                Connection cnx;

    public Service_type_service_demenag(Connection cnx) {
        this.cnx = cnx;
    }

                
                
    @Override
    public void ajouter(Type_service_demenag t) {
         try {

            String req = "INSERT INTO `type_service_demenag`(`type_demenag`,`duree_service_demenag`) VALUES ('"+t.getType_demenag()+"','"+t.getDuree_service_demenag()+"')";
            java.sql.Statement stm = cnx.createStatement(); 
            stm.executeUpdate(req);
            System.out.println("Rendez_vous est  ajouté avec succés");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    @Override
    public void modifier(Type_service_demenag t) {
        
        try {
            String req="update Type_service_demenag SET type_demenag=?,duree_service_demenag=?" ;
            PreparedStatement st = cnx.prepareStatement(req);
           st.setString(1, t.getType_demenag());
            st.setString(2, t.getDuree_service_demenag());
            
            
            st.executeUpdate();
            System.out.println(" Type_service_demenag est Modifiée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }    
        
        
        
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

   

    @Override
    public void supprimer(int id) {
try {
            String req = "DELETE FROM Type_service_demenag WHERE id_service_demenag="+id+"";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("le type de service  est supprimée avec succés");
        }
catch (SQLException ex) {
            System.out.println(ex);
        }      
}

    

    @Override
    public ObservableList<Type_service_demenag> getAll() {
        String rep = "SELECT * FROM type_service_demenag";
        ObservableList<Type_service_demenag> Type_service_demenag =FXCollections.observableArrayList();
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
                Type_service_demenag typeserv = new Type_service_demenag();
                typeserv.setId_service_demenag(rs.getInt(1));
                typeserv.setType_demenag(rs.getString(2));
                typeserv.setDuree_service_demenag(rs.getString(3));
                
                Type_service_demenag.add(typeserv);
                System.out.println(Type_service_demenag);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Type_service_demenag+"\n");
        return Type_service_demenag;
    
    }
    
    

  
 }
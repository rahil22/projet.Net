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
import tn.edu.GestionImmobiliere.entities.Type_transport;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 *
 * @author Rahil
 */
public class Service_type_transport_demenag implements IService_demenag<Type_transport>{
      
    Connection cnx;
       public Service_type_transport_demenag (Connection cnx){
       this.cnx = DataSource.getInstance().getConnection();} 
    
    
    
    @Override
    public void ajouter(Type_transport t) {
        
        try {

            String req = "INSERT INTO type_transport`(' nom_transport_demenag',  'capacite_transport_demenag') VALUES ('" + t.getNom_transport_demenag()+ "','"+t.getCapacite_transport_demenag()+"')";
            java.sql.Statement stm = cnx.createStatement(); 
            stm.executeUpdate(req);
            System.out.println("type de transport est  ajouté avec succés");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
    

    @Override
    public void modifier(Type_transport t) {
try {
            String req="update type_transport SET nom_transport_demenag=?,capacite_transport_demenag=?" ;
            PreparedStatement st = cnx.prepareStatement(req);
           st.setString(1, t.getNom_transport_demenag());
            st.setString(2, t.getCapacite_transport_demenag());
            
            
            st.executeUpdate();
            System.out.println(" type_transport est Modifiée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }        }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////
    ///////////////////////////////
    ///////////////////
    //////////////////////
    @Override
    public void supprimer(int id) {
try {
            String req = "DELETE FROM type_transport WHERE id_transport_demenag="+id+"";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("le type de transport  est supprimée avec succés");
        }
catch (SQLException ex) {
            System.out.println(ex);
        }          }
//////////////
    /////////////////////
    //////////////////////////
    ///////////////////////
    @Override
    public Type_transport getOne(int id) {
        
        String rep = "SELECT * FROM type_transport WHERE `id_transport_demenag`="+id;
      
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
               /////////
                Type_transport transp =new Type_transport();
                transp.setId_transport_demenag(rs.getInt(1));
                transp.setNom_transport_demenag(rs.getString(2));
                transp.setCapacite_transport_demenag(rs.getString(3));
                
               
                System.out.println(transp);
                return transp;     
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        return null ;
        
        
        
        
    }

    @Override
    public List<Type_transport> getAll() {
String rep = "SELECT * FROM type_transport";
        ArrayList<Type_transport> Type_transport = new ArrayList();
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
                Type_transport typetrsp = new Type_transport();
                typetrsp.setId_transport_demenag(rs.getInt(1));
                typetrsp.setNom_transport_demenag(rs.getString(2));
                typetrsp.setCapacite_transport_demenag(rs.getString(3));
                
                Type_transport.add(typetrsp);
                
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(Type_transport+"\n");
        return Type_transport;

    }      }

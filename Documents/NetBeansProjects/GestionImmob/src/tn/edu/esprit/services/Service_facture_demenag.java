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
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 *
 * @author Rahil
 */

public class Service_facture_demenag implements IService_demenag<Facture_demenag>
 {     Connection cnx;
       public Service_facture_demenag (){
       this.cnx = DataSource.getInstance().getConnection();
       }

    @Override
    public void ajouter(Facture_demenag t) {
        
       try {

            String req = "INSERT INTO `facture`(`kilometrage`, `nbre_personnels`, `quantite_demeneg`,`Adresse_facture_demenag`,`user_id`,`id_service_demenag`,`type_transport` ) VALUES ('" + t.getKilometrage()+ "','"+t.getNbre_personnels()+"','" + t.getQuantite_demeneg()+ "','"+t.getAdresse_facture_demenag()+ "','"+t.getUser_id()+ "','"+t.getId_service_demenag()+ "','"+t.getType_transport()+ "')" ;
            java.sql.Statement stm = cnx.createStatement(); 
            stm.executeUpdate(req);
            System.out.println("Facture est  ajoutée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



    @Override
    public void modifier(Facture_demenag t) {
try {
  String req="update facture SET kilometrage=?,nbre_personnels=?,quantite_demeneg=? , adresse_facture_demenag=?  , user_id=? ,id_service_demenag=? ,type_transport=?   where id_facture_demenag=?" ;
  PreparedStatement st = cnx.prepareStatement(req);
///////
            st.setString(1, t.getKilometrage());
            st.setString(2, t.getNbre_personnels());
            st.setString(3,t.getQuantite_demeneg());
            st.setString(4, t.getAdresse_facture_demenag());
            st.setInt(5, t.getUser_id());
            st.setInt(6,t.getId_service_demenag());
            st.setString(7, t.getType_transport());
            
            st.executeUpdate();
            System.out.println(" Facture_demenag est Modifiée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }    }

    @Override 
    public void supprimer(int id ) {
 try {
            String req = "DELETE FROM facture WHERE id_facture_demenag="+id+"";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("Facture est supprimée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }    }

   

    @Override
    public List<Facture_demenag> getAll( ) {
        
        
        String rep = "SELECT * FROM facture";
        ArrayList<Facture_demenag> facture = new ArrayList();
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
                Facture_demenag fact = new Facture_demenag();
                fact.setId_facture_demenag(rs.getInt(1));
                fact.setKilometrage(rs.getString(2));
                fact.setNbre_personnels(rs.getString("nbre_personnels"));
                fact.setQuantite_demeneg(rs.getString(4));
                fact.setAdresse_facture_demenag(rs.getString(5));
                fact.setUser_id(rs.getInt(6));
                fact.setId_service_demenag(rs.getInt(7));
                fact.setType_transport(rs.getString(8));
                facture.add(fact);
                
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(facture+"\n");
        return facture;

    }

    /// @Override 
    //
    /*public Facture_demenag getOne( int id) {
String rep = "SELECT * FROM facture WHERE `id_facture_demenag`="+id;
      
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
               //    System.out.println("rr");
                Facture_demenag fd=new Facture_demenag();
                fd.setId_facture_demenag(rs.getInt(1));
                fd.setKilometrage(rs.getString(2));
                fd.setNbre_personnels(rs.getString("nbre_personnels"));
                fd.setQuantite_demeneg(rs.getString(4));
                fd.setAdresse_facture_demenag(rs.getString(5));
                fd.setId_agence(rs.getInt(6));
               
                System.out.println(fd);
                return fd;    
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        return null ;
        
            }*////

    @Override
    public Facture_demenag getOne(int id) {
String rep = "SELECT * FROM facture WHERE `id_facture_demenag`="+id;
      
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
               //    System.out.println("rr");
                Facture_demenag fd=new Facture_demenag();
                fd.setId_facture_demenag(rs.getInt(1));
                fd.setKilometrage(rs.getString(2));
                fd.setNbre_personnels(rs.getString("nbre_personnels"));
                fd.setQuantite_demeneg(rs.getString(4));
                fd.setAdresse_facture_demenag(rs.getString(5));
                fd.setUser_id(rs.getInt(6));
                fd.setId_service_demenag(rs.getInt(7));
                 fd.setType_transport(rs.getString(8));
               
                System.out.println(fd);
                return fd;    
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        return null ;
            }

   
    
}

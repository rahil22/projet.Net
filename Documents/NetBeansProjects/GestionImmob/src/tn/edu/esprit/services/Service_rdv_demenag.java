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
import tn.edu.GestionImmobiliere.entities.Rdv_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 *
 * @author Rahil
 */
public class Service_rdv_demenag implements IService_demenag<Rdv_demenag>{
    
     Connection cnx;
       public Service_rdv_demenag (Connection cnx){
       this.cnx = DataSource.getInstance().getConnection();
       }
       

    @Override
    public void ajouter(Rdv_demenag t) {
        
        try {

            String req = "INSERT INTO `rdv_demenag`(`date_deb_demenag`,  `date_fin_demenag`,  `kilometrage_demenag`, `adresse_demenag`, `user_id`) VALUES ('" + t.getDate_deb_demenag()+ "','"+t.getDate_fin_demenag()+"','" + t.getKilometrage_demenag()+ "','"+t.getAdresse_demenag()+"','"+t.getUser_id()+"')";
            java.sql.Statement stm = cnx.createStatement(); 
            stm.executeUpdate(req);
            System.out.println("Rendez_vous est  ajouté avec succés");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }

    @Override
    public void modifier(Rdv_demenag t) {

try {
            String req="update rdv_demenag SET date_deb_demenag=?,date_fin_demenag=?,kilometrage_demenag=? , adresse_demenag=? , user_id=? where id_rdv_demenag=?" ;
            PreparedStatement st = cnx.prepareStatement(req);
            //Mouch mohem tartib les instruction numero ya3ty indication 3al blasetha fel requete
           st.setString(1, t.getDate_deb_demenag());
            st.setString(2, t.getDate_fin_demenag());
            st.setString(3,t.getKilometrage_demenag());
             st.setString(4, t.getAdresse_demenag());
             st.setInt(5, t.getUser_id());
            
            st.executeUpdate();
            System.out.println(" Facture_demenag est Modifiée avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }    }

    @Override
    public void supprimer(int id) {
        
        try {
            String req = "DELETE FROM rdv_demenag WHERE id_rdv_demenag="+id+"";
            Statement stm = cnx.createStatement();
            stm.executeUpdate(req);
            System.out.println("Rendez_vous  est supprimé avec succés");
        } catch (SQLException ex) {
            System.out.println(ex);
        }   
    }

    @Override
    public Rdv_demenag getOne(int id) {
String rep = "SELECT * FROM rdv_demenag WHERE `id_rdv_demenag`="+id;
      
        Statement stm;
        try {
            stm = this.cnx.createStatement();
            ResultSet rd = stm.executeQuery(rep);

            while (rd.next()) {
               //    System.out.println("rr");
                Rdv_demenag rv=new Rdv_demenag();
                rv.setId_rdv_demenag(rd.getInt(1));
                rv.setDate_deb_demenag(rd.getString(2));
                rv.setDate_fin_demenag(rd.getString(3));
                rv.setKilometrage_demenag(rd.getString(4));
                rv.setAdresse_demenag(rd.getString(5));
                rv.setUser_id(rd.getInt(6));
               
                System.out.println(rv);
                return rv;    
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        return null ;
        
            

    }

    @Override
    public List<Rdv_demenag> getAll() {
              
    String rep = "SELECT * FROM rdv_demenag";
        ArrayList<Rdv_demenag> rdv = new ArrayList();
        Statement stm;
        
        
        
        
        try {
            stm = this.cnx.createStatement();
            ResultSet rs = stm.executeQuery(rep);

            while (rs.next()) {
                Rdv_demenag rdv1 = new Rdv_demenag();
                rdv1.setId_rdv_demenag( rs.getInt(1)); 
                rdv1.setDate_deb_demenag( rs.getString(2));
                rdv1.setDate_fin_demenag(rs.getString(3));
                rdv1.setKilometrage_demenag(rs.getString("Kilometrage_demenag"));
                rdv1.setAdresse_demenag(rs.getString(5));
                rdv1.setUser_id(rs.getInt(6));
                
                rdv.add(rdv1);
                
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         String rdv1 = null;
        System.out.println(rdv +"\n");
        return null;

    }    
    
      

    
    
    
}

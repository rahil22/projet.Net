/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionimmob;

import java.sql.Connection;
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.entities.Rdv_demenag;
import tn.edu.GestionImmobiliere.entities.Type_service_demenag;
import tn.edu.GestionImmobiliere.services.Service_facture_demenag;
import tn.edu.GestionImmobiliere.services.Service_rdv_demenag;
import tn.edu.GestionImmobiliere.services.Service_type_service_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 *
 * @author Rahil
 */
public class GestionImmob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        Connection cnx = DataSource.getInstance().getConnection();
       /// Connection cnx1 = DataSource.getInstance().getConnection();
        //Service_type_service_demenag  st = new Service_type_service_demenag() ; 
        //Service_facture_demenag sd=new Service_facture_demenag();
         Service_rdv_demenag  rd =new Service_rdv_demenag(cnx);
         Rdv_demenag rd1 = new Rdv_demenag("jjj", "jj", "200km", "tunis", 1);
         //Type_service_demenag fd = new Type_service_demenag("22","6");
         //Type_service_demenag fd1 = new Type_service_demenag(1,"normal","6h");
        //Facture_demenag fd = new Facture_demenag( "100", "5", "max", "tunis", 1 ,3 ,"grande");
       //st.getOne(1);
       //sd.ajouter(fd);
        rd.ajouter(rd1); 
       //st.supprimer(2);
       // System.out.println(st.getOne(1));;
         //sd.ajouter(fd);
    }
    
    
    
}

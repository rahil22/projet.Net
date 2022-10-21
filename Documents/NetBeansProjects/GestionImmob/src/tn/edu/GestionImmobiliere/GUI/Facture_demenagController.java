/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.GUI;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.services.Service_facture_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;
import javafx.scene.control.cell.PropertyValueFactory ;

/**
 * FXML Controller class
 *
 * @author Rahil
 */
public class Facture_demenagController implements Initializable {

    @FXML
    private Label quant_demenag;
    @FXML
    private TextField quantite_dem;
    @FXML
    private TextField type_trans;
    @FXML
    private TextField adresse;
    @FXML
    private TextField nbr_pers;
    @FXML
    private TextField kilometre;
    @FXML
    private TableColumn<Facture_demenag,String> kilometr;
    @FXML
    private TableColumn<Facture_demenag,String> qtt;
    @FXML
    private TableColumn<Facture_demenag,String> nbr;
    @FXML
    private TableColumn<Facture_demenag,String> addr;
    @FXML
    private TableColumn<Facture_demenag,String> typetr;
    @FXML
    private TableColumn<Facture_demenag,Integer> id_ser;
    @FXML
    private TableColumn<Facture_demenag,Integer> id_us;
    @FXML
    private TableView<Facture_demenag> tree_facture;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        
         Connection cnx =DataSource.getInstance().getConnection();
        Service_facture_demenag sm=new Service_facture_demenag();
          ObservableList<Facture_demenag>  list  = (ObservableList<Facture_demenag>) sm.getAll();
         
          System.out.println(list);
           tree_facture.setItems(list) ;
         Afficher_Facture_demenag(event);
         
         
        
    }    
    
    @FXML
    private void ajouter_facture(ActionEvent event) {
         Facture_demenag mc=new Facture_demenag(kilometre.getText(),nbr_pers.getText(),quantite_dem.getText(),adresse.getText(),type_trans.getText());
        Connection cnx = DataSource.getInstance().getConnection();
        Service_facture_demenag  smc = new Service_facture_demenag(cnx);
        smc.ajouter(mc);
        
        Afficher_Facture_demenag(event);
        
        ObservableList<Facture_demenag> list = smc.getAll();
    }

    @FXML
    private void supprimer_facture(ActionEvent event) {
        int t = tree_facture.getSelectionModel().getSelectedItem().getId_service_demenag();
        Connection cnx = DataSource.getInstance().getConnection();
        Service_facture_demenag sd = new Service_facture_demenag(); 
        
        sd.supprimer(t);
   Afficher_Facture_demenag(event);
    }

    @FXML
    private void modifier_facture(ActionEvent event) {
    }
        private void Afficher_Facture_demenag(ActionEvent event){
                Connection cnx =DataSource.getInstance().getConnection();
        Service_facture_demenag sm=new Service_facture_demenag();
          ObservableList<Facture_demenag>  list  = (ObservableList<Facture_demenag>) sm.getAll();
    
        kilometre.setCellValueFactory(new PropertyValueFactory<Facture_demenag, String>("kilometrage"));
         nbr_pers.setCellValueFactory(new PropertyValueFactory<Facture_demenag, String>("nbre_personnels"));
         quantite_dem.setCellValueFactory(new PropertyValueFactory<Facture_demenag, String>("quantite_demeneg"));
         adresse.setCellValueFactory(new PropertyValueFactory<Facture_demenag, String>("adresse_facture_demenag"));
         type_trans.setCellValueFactory(new PropertyValueFactory<Facture_demenag, String>("type_transport"));
           
         System.out.println(list);
         
         
         tree_facture.setItems(list);
        
    }
    
}

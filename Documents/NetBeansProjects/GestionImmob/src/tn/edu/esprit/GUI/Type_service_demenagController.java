/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.GUI;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.entities.Type_service_demenag;
import tn.edu.GestionImmobiliere.services.Service_type_service_demenag;
import tn.edu.GestionImmobiliere.tools.DataSource;

/**
 * FXML Controller class
 *
 * @author Rahil
 */
public class Type_service_demenagController implements Initializable {
    
    
    
    @FXML 
    private Pane pane_typeservice;
    @FXML
    private TableView<Type_service_demenag> tree_demenage;
    @FXML
    private TableColumn<Type_service_demenag, String> type_demange_t;
    @FXML
    private TableColumn<Type_service_demenag, String> Duree_service_dem_t;
    @FXML
    private TextField duree_service;
    @FXML
    private Button ajouter_service_demenag;
    @FXML
    private Button modifier_service_demenag;
    @FXML
    private Button supprimer_service_demenag;
    @FXML
    private ChoiceBox<String> choicebox_type_demenag;
    private final String[] t = {"Totale" ,"Normale"};
    @FXML
    private Button drv_button;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        choicebox_type_demenag.getItems().addAll(t);
        
        Connection cnx =DataSource.getInstance().getConnection();
        Service_type_service_demenag sm=new Service_type_service_demenag(cnx);
          ObservableList<Type_service_demenag>  list  = sm.getAll();
    
        type_demange_t.setCellValueFactory(new PropertyValueFactory<Type_service_demenag, String>("type_demenag"));
         Duree_service_dem_t.setCellValueFactory(new PropertyValueFactory<Type_service_demenag, String>("duree_service_demenag"));
           
         System.out.println(list);
         
         tree_demenage.setItems(list);
         
         
         
             

    }
    
    private void Affichier_Type_Service(ActionEvent event){
                Connection cnx =DataSource.getInstance().getConnection();
        Service_type_service_demenag sm=new Service_type_service_demenag(cnx);
          ObservableList<Type_service_demenag>  list  = sm.getAll();
    
        type_demange_t.setCellValueFactory(new PropertyValueFactory<Type_service_demenag, String>("type_demenag"));
         Duree_service_dem_t.setCellValueFactory(new PropertyValueFactory<Type_service_demenag, String>("duree_service_demenag"));
           
         System.out.println(list);
         
         tree_demenage.setItems(list);
        
    }
      
        
      
    

    @FXML
    private void Ajouter_serv_dem(ActionEvent event) {
          //java.sql.Date date1 = new java.sql.Date(id_date_dossier_const.getValue().getYear() - 1900, id_date_dossier_const.getValue().getMonthValue() - 1, id_date_dossier_const.getValue().getDayOfMonth());
       Type_service_demenag mc=new Type_service_demenag(choicebox_type_demenag.getValue(),duree_service.getText());
        Connection cnx = DataSource.getInstance().getConnection();
        Service_type_service_demenag smc = new Service_type_service_demenag(cnx);
        smc.ajouter(mc);
        
        Affichier_Type_Service(event);
        
        ObservableList<Type_service_demenag> list = smc.getAll();
        
        

        
    }

    @FXML
    private void modifier_serv_dem(ActionEvent event) {
        
        Affichier_Type_Service(event);
        
         Connection cnx = DataSource.getInstance().getConnection();
        Service_type_service_demenag sd = new Service_type_service_demenag(cnx);
        
        
        FX_rahil_main.smc = tree_demenage.getSelectionModel().getSelectedItem();
        
                  
        
        
    }

    @FXML
    private void supprimer_serv_dem(ActionEvent event) {
        
        
        int T = tree_demenage.getSelectionModel().getSelectedItem().getId_service_demenag();
        Connection cnx = DataSource.getInstance().getConnection();
        Service_type_service_demenag sd = new Service_type_service_demenag(cnx);
        
        sd.supprimer(T);
        
        
        
        
    Affichier_Type_Service(event);
    }
   
 
   
    @FXML
    private void Afficher_rdv(ActionEvent event) throws IOException{
drv_button.getScene().getWindow().hide();
              Parent root = FXMLLoader.load(getClass().getResource("Rdv_demenagController.fxml"));
                Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        
    }
      
    }
   

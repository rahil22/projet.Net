/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.GUI;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tn.edu.GestionImmobiliere.entities.Facture_demenag;
import tn.edu.GestionImmobiliere.entities.Type_service_demenag;
import tn.edu.GestionImmobiliere.services.Service_facture_demenag;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Rahil
 */
public class FX_rahil_main extends Application {
    
    static Type_service_demenag d=new Type_service_demenag();
    static Type_service_demenag smc=new Type_service_demenag();
    
    
    @Override
    public void start(Stage stage) throws IOException {
        
        

        Parent root = FXMLLoader.load(getClass().getResource("Type_service_demenag.fxml"));
         
        
        
        Scene scene = new Scene(root);
         stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}

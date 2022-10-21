/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rahil
 */
public class RdvController implements Initializable {

    @FXML
    private Button modif_rdv;
    @FXML
    private Button ajout_rdv;
    @FXML
    private Button supprimer_rd;
    @FXML
    private TextField debut_txt;
    @FXML
    private TextField fin_txt;
    @FXML
    private TextField kilomet_txt;
    @FXML
    private TextField adresse_txt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void modifier_rdv(ActionEvent event) {
    }

    @FXML
    private void ajouter_rdv(ActionEvent event) {
    }

    @FXML
    private void supprimer_rdv(ActionEvent event) {
    }
    
}

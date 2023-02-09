/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Rahil
 */
public class DataSource {
    private Connection cnx;
    private static DataSource instance;
    
    private String url = "jdbc:mysql://localhost:3306/agence_immobiliere";
    private String user = "root";
    private String password = "";
    
    private DataSource(){
        try {
            cnx = DriverManager.getConnection(url, user, password);
            System.out.println("connected to DB !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static DataSource getInstance(){
        if(instance == null){
            instance = new DataSource();
        }
        return instance;
    }
    
    public Connection getConnection(){

        return this.cnx;
    }
}

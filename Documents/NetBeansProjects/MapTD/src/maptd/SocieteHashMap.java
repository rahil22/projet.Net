/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maptd;

import java.util.HashMap;

/**
 *
 * @author Rahil
 */
public class SocieteHashMap implements InterfaceSociete {
    HashMap H ; 

    public SocieteHashMap() {
        this.H = new HashMap ();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
       H.put(e, d); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEmploye(Employe e) {
       H.remove(e) ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
       for ( Employe cle:H.keySet()){
        Departement value = H.get(cle)   ;
           System.out.println("l'employee:" + get.nom() + get.id());
       } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesEmployes() {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherLesDepartements() {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afficherDepartement(Employe e) {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
       ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        ; //To change body of generated methods, choose Tools | Templates.
        return false;
    }
    
}

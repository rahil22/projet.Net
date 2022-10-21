/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1java;

/**
 *
 * @author Rahil
 */
public class Prosit1java {

    
    public static void main(String[] args) {
       ProduitAlimentaire produit1 = new ProduitAlimentaire() ;
       ProduitAlimentaire produit2 = new ProduitAlimentaire(111,"delice","tunis") ;
         ProduitAlimentaire produit3 = new ProduitAlimentaire(112,"vitalait","nabeul",333) ;
    
       produit3.afficher();
    }

    
   
    
}

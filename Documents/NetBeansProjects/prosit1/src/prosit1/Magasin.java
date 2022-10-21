/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1;

/**
 *
 * @author Rahil
 */
public class Magasin {
    int identifiant ;
    String adresse ;
    int capacite;
    Produit[] produit ;
    public Magasin (int identifiant , String adresse ){
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produit = new Produit [50] ;
    }
    @Override 
    public String toString (){
        String s= '' ;
        s= "L'identifiant est " +identifiant + "/n"+ "L'adresse est " + adresse +"/n" ;
        return s ;
    }
}

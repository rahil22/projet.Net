/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1;


public class Prosit1 {

  
  
    public static void main(String[] args) {
       
        Produit p1 = new Produit () ;
        Produit p2 = new Produit (1021,"Lait","Delice") ;
        Produit p3 = new Produit (2510,"Yaourt","Vitalait") ;
        Produit p4 = new Produit (3250,"Tomate","sicam", 1.200) ;
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        p2.prix=0.700;
        p2.afficher();
        p3.prix=500;
        p3.afficher();
       System.out.println(p2.toString());
       
      
       
        
    }
    
}

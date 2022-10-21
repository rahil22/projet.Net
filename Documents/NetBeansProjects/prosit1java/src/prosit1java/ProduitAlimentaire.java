/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1java;

class ProduitAlimentaire { 
int identif;
String libelle;
String marque;
 float prix;

    public ProduitAlimentaire() {
    }

    public ProduitAlimentaire(int identif, String libelle, String marque) {
        this.identif = identif;
        this.libelle = libelle;
        this.marque = marque;
    }

    public ProduitAlimentaire(int identif, String libelle, String marque, float prix) {
        this.identif = identif;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

  public void afficher ( ){
    System.out.println("identif= "+this.identif);
    System.out.println("libelle= "+this.libelle);
    System.out.println("marque= "+this.marque);
    System.out.println("prix= "+this.prix);
    
    
  } 

}
    
   
    




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
public class Produit {
  int identifiant ;
  String  libelle;
  String marque;
  double prix ;  
  
  
  Produit () {} 
  Produit(int id,String lb,String mq){
  identifiant=id ;
  libelle=lb ;
  marque=mq;
  }
  Produit(int identifiant,String libelle,String marque,double prix){
  this.identifiant=identifiant ;
  this.libelle=libelle ;
  this.marque=marque;
  this.prix=prix;
  
  }
  void afficher(){
      System.out.println("identifiant est : "+identifiant);
      System.out.println("libelle est : "+libelle);
      System.out.println("marque est : "+marque);
      System.out.println("prix est : "+prix);
   
      
  }
  @Override
 public String toString(){
     
     String s="";
     
       s = "L'identifiant est" + this.identifiant +  " libelle est : " + this.libelle + " marque est : "+ this.marque ;
     return s;
     
 }    
  
  
  
   /* @Override
      public String toString(){
          String s;
          s = "L'identifiant est" + this.identifiant +  " libelle est : " + this.libelle + " marque est : "+ this.marque ;
          
          
          return s;
          
  }*/
  }
      
  

  
    


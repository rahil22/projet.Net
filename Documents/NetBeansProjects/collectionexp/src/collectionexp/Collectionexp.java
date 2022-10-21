/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexp;
import static java.time.Clock.system;
import java.util.* ;
import java.util.logging.Logger;
public class Collectionexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList array = new ArrayList() ;
       
       array.add(5);
       array.add(4);
       array.add("3B8");
       array.add("test");
        System.out.println(array);
        System.out.println(array.size());
        
        personne p1 = new personne (44,"amen","mmm");
         personne p2 = new personne (45,"ameni","aaa");
         personne p3 = new personne (46,"aymen","lll");
         
         
         
        array.add(p1);
        array.add(p2);
        array.add(p3);
         System.out.println(array);
         System.out.println(array.contains(p1));
         
         
         //afficher les noms
         for ( int i=0 ; i<array.size(); i++){
             if (array.get(i) instanceof personne){
                 personne p =( personne) array.get(i);
                 System.err.println("les noms despersonnes "+ p.getNom());
             }
         }
         
         
         
         //creer 1 liste de type personne 
         ArrayList<personne> arrayP = new ArrayList();
         
         
          personne pp1 = new personne (44,"amen","mmm");
         personne pp2 = new personne (45,"ameni","aaa");
         personne pp3 = new personne (46,"aymen","lll");
         
         
         
        arrayP.add(pp1);
        arrayP.add(pp2);
        arrayP.add(pp3);
          
         
          for ( int i=0 ; i<arrayP.size(); i++){
             
                 System.err.println("les noms despersonnes "+ arrayP.get(i).getNom());
             
         }
         
         
         ArrayList<
        
        
    }
   
    
}

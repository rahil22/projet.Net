/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Rahil
 */
public class EspritTreeSet implements  NewInterface{
TreeSet tree = new TreeSet();
    @Override
    public void ajouterEnseignant(Enseignant e) {
               tree.add(e);

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
               return tree.contains(e);
  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean rechercherEnseignant(int id) {
     Iterator<Enseignant> i = tree.iterator();
       while (i.hasNext()){
           Enseignant e = i.next();
           ///if (i.next().getId() == id){ on peut faire ca directement
           if (e.getId() == id){
               return true;
           }
       }
       return false;     //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
                tree.remove(e);
  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayEnseignants() {
       System.out.println("La list des enseignants "+tree); 
       //To change body of generated methods, choose Tools | Templates.
    }
    
}

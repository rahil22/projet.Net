/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdset;

import java.util.HashSet;


public class EspritHashSet {
    
    public class EspritHashSet implements NewInterface{ 
        HashSet hash = new HashSet ();
        @Override
        public void ajouterEnseignant(Enseignant e) {
           hash.add(e);
           
        }

        @Override
        public boolean rechercherEnseignant(Enseignant e) {
            return hash.contains(e);
        }

        @Override
        public boolean rechercherEnseignant(int id) {
            Iterator<Enseignant> i = hash.iterator();
       while (i.hasNext()){
           Enseignant e = i.next();
           if (e.getId() == id){
               return true;
           }
       }
       return false;
        }

        @Override
        public void supprimerEnseignant(Enseignant e) {
                    hash.remove(e);
        }
        
        @Override
        public void displayEnseignants() {
            System.out.println("La list des enseignants "+hash);
        }
       

    }
    
}

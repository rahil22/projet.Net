/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.entities;

import java.util.Objects;

/**
 *
 * @author Rahil
 */
public class Type_transport {
     
    private int id_transport_demenag;
    private String nom_transport_demenag;
    private String capacite_transport_demenag;
    

    public Type_transport(String nom_transport_demenag, String capacite_transport_demenag, String climatisation_transport_demenag) {
        this.nom_transport_demenag = nom_transport_demenag;
        this.capacite_transport_demenag = capacite_transport_demenag;
        
    }

    public Type_transport() {
    }
    
    
    
    

    public Type_transport(int id_transport_demenag, String nom_transport_demenag, String capacite_transport_demenag, String climatisation_transport_demenag) {
        this.id_transport_demenag = id_transport_demenag;
        this.nom_transport_demenag = nom_transport_demenag;
        this.capacite_transport_demenag = capacite_transport_demenag;
        
    }

    public int getId_transport_demenag() {
        return id_transport_demenag;
    }

    public void setId_transport_demenag(int id_transport_demenag) {
        this.id_transport_demenag = id_transport_demenag;
    }

    public String getNom_transport_demenag() {
        return nom_transport_demenag;
    }

    public void setNom_transport_demenag(String nom_transport_demenag) {
        this.nom_transport_demenag = nom_transport_demenag;
    }

    public String getCapacite_transport_demenag() {
        return capacite_transport_demenag;
    }

    public void setCapacite_transport_demenag(String capacite_transport_demenag) {
        this.capacite_transport_demenag = capacite_transport_demenag;
    }

   
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id_transport_demenag);
        hash = 67 * hash + Objects.hashCode(this.nom_transport_demenag);
        hash = 67 * hash + Objects.hashCode(this.capacite_transport_demenag);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Type_transport other = (Type_transport) obj;
        if (!Objects.equals(this.id_transport_demenag, other.id_transport_demenag)) {
            return false;
        }
        if (!Objects.equals(this.nom_transport_demenag, other.nom_transport_demenag)) {
            return false;
        }
        if (!Objects.equals(this.capacite_transport_demenag, other.capacite_transport_demenag)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "type_transport{" + "id_transport_demenag=" + id_transport_demenag + ", nom_transport_demenag=" + nom_transport_demenag + ", capacite_transport_demenag=" + capacite_transport_demenag  + '}';
    }
    
    
    
    
    
}


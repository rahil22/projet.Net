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
public class Type_service_demenag {
    
    private int id_service_demenag;
    private String type_demenag;
    private String duree_service_demenag;

    public Type_service_demenag() {
    }

    public Type_service_demenag(String type_demenag, String duree_service_demenag) {
        this.type_demenag = type_demenag;
        this.duree_service_demenag = duree_service_demenag;
    }
    
    
    
    
    

    public Type_service_demenag(int id_service_demenag, String type_demenag, String duree_service_demenag) {
        this.id_service_demenag = id_service_demenag;
        this.type_demenag = type_demenag;
        this.duree_service_demenag = duree_service_demenag;
    }

    public int getId_service_demenag() {
        return id_service_demenag;
    }

    public void setId_service_demenag(int id_service_demenag) {
        this.id_service_demenag = id_service_demenag;
    }

    public String getType_demenag() {
        return type_demenag;
    }

    public void setType_demenag(String type_demenag) {
        this.type_demenag = type_demenag;
    }

    public String getDuree_service_demenag() {
        return duree_service_demenag;
    }

    public void setDuree_service_demenag(String duree_service_demenag) {
        this.duree_service_demenag = duree_service_demenag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id_service_demenag);
        hash = 43 * hash + Objects.hashCode(this.type_demenag);
        hash = 43 * hash + Objects.hashCode(this.duree_service_demenag);
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
        final Type_service_demenag other = (Type_service_demenag) obj;
        if (!Objects.equals(this.id_service_demenag, other.id_service_demenag)) {
            return false;
        }
        if (!Objects.equals(this.type_demenag, other.type_demenag)) {
            return false;
        }
        if (!Objects.equals(this.duree_service_demenag, other.duree_service_demenag)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "type_service{" + "id_service_demenag=" + id_service_demenag + ", type_demenag=" + type_demenag + ", duree_service_demenag=" + duree_service_demenag + '}';
    }
    
    
    
    
    
}

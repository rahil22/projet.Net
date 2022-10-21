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



public class Rdv_demenag {
    private int id_rdv_demenag ; 
    private String date_deb_demenag;
    private String date_fin_demenag;
    private String kilometrage_demenag;
    private String adresse_demenag; 
private int user_id ; 

    public Rdv_demenag() {
    }

    public Rdv_demenag(String date_deb_demenag, String date_fin_demenag, String kilometrage_demenag, String adresse_demenag, int user_id) {
        this.date_deb_demenag = date_deb_demenag;
        this.date_fin_demenag = date_fin_demenag;
        this.kilometrage_demenag = kilometrage_demenag;
        this.adresse_demenag = adresse_demenag;
        this.user_id = user_id;
    }

    public Rdv_demenag(int id_rdv_demenag, String date_deb_demenag, String date_fin_demenag, String kilometrage_demenag, String adresse_demenag, int user_id) {
        this.id_rdv_demenag = id_rdv_demenag;
        this.date_deb_demenag = date_deb_demenag;
        this.date_fin_demenag = date_fin_demenag;
        this.kilometrage_demenag = kilometrage_demenag;
        this.adresse_demenag = adresse_demenag;
        this.user_id = user_id;
    }

    public int getId_rdv_demenag() {
        return id_rdv_demenag;
    }

    public void setId_rdv_demenag(int id_rdv_demenag) {
        this.id_rdv_demenag = id_rdv_demenag;
    }

    public String getDate_deb_demenag() {
        return date_deb_demenag;
    }

    public void setDate_deb_demenag(String date_deb_demenag) {
        this.date_deb_demenag = date_deb_demenag;
    }

    public String getDate_fin_demenag() {
        return date_fin_demenag;
    }

    public void setDate_fin_demenag(String date_fin_demenag) {
        this.date_fin_demenag = date_fin_demenag;
    }

    public String getKilometrage_demenag() {
        return kilometrage_demenag;
    }

    public void setKilometrage_demenag(String kilometrage_demenag) {
        this.kilometrage_demenag = kilometrage_demenag;
    }

    public String getAdresse_demenag() {
        return adresse_demenag;
    }

    public void setAdresse_demenag(String adresse_demenag) {
        this.adresse_demenag = adresse_demenag;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id_rdv_demenag;
        hash = 83 * hash + Objects.hashCode(this.date_deb_demenag);
        hash = 83 * hash + Objects.hashCode(this.date_fin_demenag);
        hash = 83 * hash + Objects.hashCode(this.kilometrage_demenag);
        hash = 83 * hash + Objects.hashCode(this.adresse_demenag);
        hash = 83 * hash + this.user_id;
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
        final Rdv_demenag other = (Rdv_demenag) obj;
        if (this.id_rdv_demenag != other.id_rdv_demenag) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (!Objects.equals(this.date_deb_demenag, other.date_deb_demenag)) {
            return false;
        }
        if (!Objects.equals(this.date_fin_demenag, other.date_fin_demenag)) {
            return false;
        }
        if (!Objects.equals(this.kilometrage_demenag, other.kilometrage_demenag)) {
            return false;
        }
        if (!Objects.equals(this.adresse_demenag, other.adresse_demenag)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rdv_demenag{" + "id_rdv_demenag=" + id_rdv_demenag + ", date_deb_demenag=" + date_deb_demenag + ", date_fin_demenag=" + date_fin_demenag + ", kilometrage_demenag=" + kilometrage_demenag + ", adresse_demenag=" + adresse_demenag + ", user_id=" + user_id + '}';
    }

    

    
    
    
    
}

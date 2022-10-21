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
public class Facture_demenag {
    private int  id_facture_demenag ;
    private String kilometrage ;
    private String nbre_personnels ;
    private String quantite_demeneg ;
    private String adresse_facture_demenag ;
      private int user_id ;
      private int id_service_demenag;
      private String type_transport ; 
      

    public Facture_demenag() {
    }

    public Facture_demenag(String kilometrage, String nbre_personnels, String quantite_demeneg, String adresse_facture_demenag, int user_id, int id_service_demenag, String type_transport) {
        this.kilometrage = kilometrage;
        this.nbre_personnels = nbre_personnels;
        this.quantite_demeneg = quantite_demeneg;
        this.adresse_facture_demenag = adresse_facture_demenag;
        this.user_id = user_id;
        this.id_service_demenag = id_service_demenag;
        this.type_transport = type_transport;
    }

    public Facture_demenag(int id_facture_demenag, String kilometrage, String nbre_personnels, String quantite_demeneg, String adresse_facture_demenag, int user_id, int id_service_demenag, String type_transport) {
        this.id_facture_demenag = id_facture_demenag;
        this.kilometrage = kilometrage;
        this.nbre_personnels = nbre_personnels;
        this.quantite_demeneg = quantite_demeneg;
        this.adresse_facture_demenag = adresse_facture_demenag;
        this.user_id = user_id;
        this.id_service_demenag = id_service_demenag;
        this.type_transport = type_transport;
    }

    public int getId_facture_demenag() {
        return id_facture_demenag;
    }

    public void setId_facture_demenag(int id_facture_demenag) {
        this.id_facture_demenag = id_facture_demenag;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getNbre_personnels() {
        return nbre_personnels;
    }

    public void setNbre_personnels(String nbre_personnels) {
        this.nbre_personnels = nbre_personnels;
    }

    public String getQuantite_demeneg() {
        return quantite_demeneg;
    }

    public void setQuantite_demeneg(String quantite_demeneg) {
        this.quantite_demeneg = quantite_demeneg;
    }

    public String getAdresse_facture_demenag() {
        return adresse_facture_demenag;
    }

    public void setAdresse_facture_demenag(String adresse_facture_demenag) {
        this.adresse_facture_demenag = adresse_facture_demenag;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId_service_demenag() {
        return id_service_demenag;
    }

    public void setId_service_demenag(int id_service_demenag) {
        this.id_service_demenag = id_service_demenag;
    }

    public String getType_transport() {
        return type_transport;
    }

    public void setType_transport(String type_transport) {
        this.type_transport = type_transport;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id_facture_demenag;
        hash = 61 * hash + Objects.hashCode(this.kilometrage);
        hash = 61 * hash + Objects.hashCode(this.nbre_personnels);
        hash = 61 * hash + Objects.hashCode(this.quantite_demeneg);
        hash = 61 * hash + Objects.hashCode(this.adresse_facture_demenag);
        hash = 61 * hash + this.user_id;
        hash = 61 * hash + this.id_service_demenag;
        hash = 61 * hash + Objects.hashCode(this.type_transport);
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
        final Facture_demenag other = (Facture_demenag) obj;
        if (this.id_facture_demenag != other.id_facture_demenag) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.id_service_demenag != other.id_service_demenag) {
            return false;
        }
        if (!Objects.equals(this.kilometrage, other.kilometrage)) {
            return false;
        }
        if (!Objects.equals(this.nbre_personnels, other.nbre_personnels)) {
            return false;
        }
        if (!Objects.equals(this.quantite_demeneg, other.quantite_demeneg)) {
            return false;
        }
        if (!Objects.equals(this.adresse_facture_demenag, other.adresse_facture_demenag)) {
            return false;
        }
        if (!Objects.equals(this.type_transport, other.type_transport)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Facture_demenag{" + "id_facture_demenag=" + id_facture_demenag + ", kilometrage=" + kilometrage + ", nbre_personnels=" + nbre_personnels + ", quantite_demeneg=" + quantite_demeneg + ", adresse_facture_demenag=" + adresse_facture_demenag + ", user_id=" + user_id + ", id_service_demenag=" + id_service_demenag + ", type_transport=" + type_transport + '}';
    }

   
    
}
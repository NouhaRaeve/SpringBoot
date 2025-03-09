package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     public long idUniversite;
     public String nomUniversite;
     public String adresse;
    @OneToOne
    private Foyer foyer;

    public Universite(long idUniversite, String adresse, String nomUniversite) {
        this.idUniversite = idUniversite;
        this.adresse = adresse;
        this.nomUniversite = nomUniversite;
        this.foyer = foyer;
    }
    public Universite() {}

    public long getIdUniversite() {
        return idUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}

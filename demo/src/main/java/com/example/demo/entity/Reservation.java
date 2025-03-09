package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    public String idReservation;
    public Date anneeUniversitaire;
    public Boolean estValide;

    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

    public Reservation(String idReservation, Date anneeUniversitaire, Boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
        this.etudiants = etudiants;
    }
    public Reservation() {}

    public Boolean getEstValide() {
        return estValide;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setEstValide(Boolean estValide) {
        this.estValide = estValide;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }
    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}

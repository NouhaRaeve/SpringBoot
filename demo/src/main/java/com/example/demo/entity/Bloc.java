package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idBloc;
    public String nomBloc;
    public long capaciteBloc;

    @ManyToOne(cascade = CascadeType.ALL)

    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<Chambre> chambres;

    public Bloc(long idBloc, String nomBloc, long capaciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }
    public Bloc() {}
    public String getNomBloc() { return nomBloc; }
    public void setNomBloc(String nomBloc) { this.nomBloc = nomBloc; }
    public long getCapaciteBloc() { return capaciteBloc; }

    public void setCapaciteBloc(long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
    public long getIdBloc() { return idBloc; }
    public void setIdBloc(long idBloc) { this.idBloc = idBloc; }
    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

}

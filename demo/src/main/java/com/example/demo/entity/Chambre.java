package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.Set;

@Entity
@Getter
@Setter
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idChambre;
    public long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    public Chambre() {}
    public Chambre(long idChambre,long numeroChambre, TypeChambre TypeC) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.TypeC = TypeC;
        this.bloc = bloc;
        this.reservations = reservations;
    }

    public long getIdChambre() {return idChambre;}
    public long getNumeroChambre() {return numeroChambre;}
    public TypeChambre getTypeC() {return TypeC;}
    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }
    public void setNumeroChambre(long numeroChambre) { this.numeroChambre = numeroChambre; }
    public void setTypeC(TypeChambre TypeC) { this.TypeC = TypeC; }
    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}

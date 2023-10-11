package com.WebApp.WebApp.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Huella")
public class Huella {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Huella")
    String huella;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHuella() {
        return huella;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public Personas getPers() {
        return pers;
    }

    public void setPers(Personas pers) {
        this.pers = pers;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_personas")
    Personas pers;
}

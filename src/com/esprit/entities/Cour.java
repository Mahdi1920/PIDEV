/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author Mahdi
 */
public class Cour {
    private int idCour;
    private int idCoach;
    private int duree;
    private String niveau;
    private String typeCours;

    public Cour() {
    }

    public Cour(int idCour, int idCoach, int duree, String niveau, String typeCours) {
        this.idCour = idCour;
        this.idCoach = idCoach;
        this.duree = duree;
        this.niveau = niveau;
        this.typeCours = typeCours;
    }

    public Cour(int idCoach, int duree, String niveau, String typeCours) {
        this.idCoach = idCoach;
        this.duree = duree;
        this.niveau = niveau;
        this.typeCours = typeCours;
    }

    public int getIdCour() {
        return idCour;
    }

    public void setIdCour(int idCour) {
        this.idCour = idCour;
    }

    public int getIdCoach() {
        return idCoach;
    }

    public int getDuree() {
        return duree;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getTypeCours() {
        return typeCours;
    }

    public void setIdCoach(int idCoach) {
        this.idCoach = idCoach;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setTypeCours(String typeCours) {
        this.typeCours = typeCours;
    }

    @Override
    public String toString() {
        return "Cour{" + "idCour=" + idCour + ", idCoach=" + idCoach + ", duree=" + duree + ", niveau=" + niveau + ", typeCours=" + typeCours + '}';
    }

}

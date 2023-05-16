/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

import java.sql.Date;

/**
 *
 * @author Mahdi
 */
public class Planning {
    private int idPlanning;
    private boolean courEnligne;
    private int idCoach;
    private Date date;

    public Planning(int idPlanning, boolean courEnligne, int idCoach, Date date) {
        this.idPlanning = idPlanning;
        this.courEnligne = courEnligne;
        this.idCoach = idCoach;
        this.date = date;
    }

    public Planning(boolean courEnligne, int idCoach, Date date) {
        this.courEnligne = courEnligne;
        this.idCoach = idCoach;
        this.date = date;
    }

    public Planning() {
    }

    public int getIdPlanning() {
        return idPlanning;
    }

    public boolean isCourEnligne() {
        return courEnligne;
    }

    public void setCourEnligne(boolean courEnligne) {
        this.courEnligne = courEnligne;
    }

  
    public int getIdCoach() {
        return idCoach;
    }

    public Date getDate() {
        return date;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
    }

   

    public void setIdCoach(int idCoach) {
        this.idCoach = idCoach;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Planning{" + "idPlanning=" + idPlanning + ", courEnligne=" + courEnligne + ", idCoach=" + idCoach + ", date=" + date + '}';
    }
}

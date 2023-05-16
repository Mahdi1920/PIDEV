/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Planning;
import com.esprit.utiles.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahdi
 */
public class ServicePlanning implements IService<Planning>{
    private Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Planning p) {
        try {
            String req = "INSERT INTO planning(courEnligne, idCoach,date) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setBoolean(1, p.isCourEnligne());
            pst.setInt(2, p.getIdCoach());
            pst.setDate(3, p.getDate());

            pst.executeUpdate();
            System.out.println("Planning ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Planning p) {
        try {
            String req = "UPDATE planning SET courEnligne=?, idCoach=? date=? WHERE idPlanning=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setBoolean(1, p.isCourEnligne());
            pst.setInt(2, p.getIdCoach());
            pst.setDate(3, p.getDate());
            pst.setInt(4, p.getIdPlanning());

            pst.executeUpdate();
            System.out.println("Planning modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void supprimer(Planning p) {
        try {
            String req = "DELETE from planning WHERE idPlanning=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, p.getIdPlanning());
            pst.executeUpdate();
            System.out.println("Planning supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Planning> afficher() {
        List<Planning> list = new ArrayList<>();
        
        String req = "SELECT * FROM planning";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Planning(rs.getInt("idPlanning"), rs.getBoolean("courEnligne"), rs.getInt("idCoach"), rs.getDate("date")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}

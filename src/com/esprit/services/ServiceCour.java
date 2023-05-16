/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Cour;
import com.esprit.utiles.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahdi
 */
public class ServiceCour implements IService<Cour>{
     private Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Cour c) {
        try {
            String req = "INSERT INTO cour(idCoach,duree,niveau,typeCour) VALUES (?,?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getIdCoach());
            pst.setInt(2, c.getDuree());
            pst.setString(3, c.getNiveau());
            pst.setString(4, c.getTypeCour());
            
            pst.executeUpdate();
            System.out.println("Cour ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Cour c) {
        try {
            String req = "UPDATE cour SET idCoach=?, duree=?, niveau=? ,typeCour=?  WHERE idCour=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getIdCoach());
            pst.setInt(2, c.getDuree());
            pst.setString(3, c.getNiveau());
            pst.setString(4, c.getTypeCour());
            pst.setInt(5, c.getIdCour());

            pst.executeUpdate();
            System.out.println("Cour modifiée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void supprimer(Cour c) {
        try {
            String req = "DELETE from cour WHERE idCour=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getIdCour());
            pst.executeUpdate();
            System.out.println("Cour supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Cour> afficher() {
        List<Cour> list = new ArrayList<>();
        
        String req = "SELECT * FROM cour";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Cour(rs.getInt("idCour"), rs.getInt("idCoach"), rs.getInt("duree"), rs.getString("niveau"),rs.getString("typeCour")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        return list;
    }
}

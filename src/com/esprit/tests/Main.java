/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.esprit.tests;

import com.esprit.entities.Cour;
import com.esprit.entities.Planning;
import com.esprit.services.ServicePlanning;
import com.esprit.services.ServiceCour;
import java.sql.Date;

/**
 *
 * @author Mahdi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicePlanning sp = new ServicePlanning();
        //sp.ajouter(new Planning(false, 14, new Date(123,4, 10)));
        //sp.modifier(new Planning(2,true, 15, java.sql.Date.valueOf("2023-05-15")));
        //System.out.println(sp.afficher());
        //sp.supprimer(new Planning(3,false, 14, new Date(123,4, 10)));
        //System.out.println(sp.afficher());
        
        ServiceCour sc = new ServiceCour();
        //sc.ajouter(new Cour(14,1,"facile","Body Combat"));
        //sc.modifier(new Cour(1,15,2,"moyen","Body Combat"));
        //System.out.println(sc.afficher());
        sc.supprimer(new Cour(1,15,2,"moyen","Body Combat"));

    }
    
}

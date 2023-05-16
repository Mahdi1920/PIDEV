/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esprit.services;

import java.util.List;

/**
 *
 * @author Mahdi
 */
public interface IService<T>{
    public void ajouter(T o);
    public void modifier(T o);
    public void supprimer(T o);
    public List<T> afficher();
}

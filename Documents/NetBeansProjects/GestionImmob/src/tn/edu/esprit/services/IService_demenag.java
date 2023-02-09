/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.GestionImmobiliere.services;

import java.util.List;

/**
 *
 * @author Rahil
 * @param <T>
 */
public interface IService_demenag <T> {
    
    
    public void ajouter(T t);
    public void modifier(T t);
    public void supprimer(int id);
    public T getOne(int id );
    public List<T> getAll();

}

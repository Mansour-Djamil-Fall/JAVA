/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Detail;

/**
 *
 * @author Mansour Djamil
 */
public class DaoDetail {
    private final String SQL_INSERT="INSERT INTO `detail` (`classe_id`, `professeur_id`, `annee`, `modules`) VALUES (?,?,?,?);";
    
    public int Insert(Detail detail){
     int nbreLigne=0;
     return nbreLigne;
    }
}



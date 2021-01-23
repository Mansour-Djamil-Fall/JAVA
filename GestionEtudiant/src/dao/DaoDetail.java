/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Detail;

/**
 *
 * @author Mansour Djamil
 */
public class DaoDetail implements IDao<Detail>{
    private final String SQL_INSERT="INSERT INTO `detail` (`classe_id`, `professeur_id`, `annee`, `modules`) VALUES (?,?,?,?);";
    private final String SQL_INSERT_MODULES="SELECT * from detail where prefesseur_id=? and classe_id=?";
    
    @Override
    public int insert(Detail detail){
     int nbreLigne=0;
     return nbreLigne;
    }
    
    
    public List<String> findModules(Detail detail){
       List<String> lModules=new ArrayList();
       return lModules;
       
    }
}



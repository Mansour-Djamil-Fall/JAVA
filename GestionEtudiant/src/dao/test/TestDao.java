/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.test;

import dao.DaoClasse;
import models.Classe;

/**
 *
 * @author Mansour Djamil
 */
public class TestDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DaoClasse daoClasse=new DaoClasse();
       //Classe classe=new Classe("GLRS3", 20);
       //daoClasse.insert(classe);
       daoClasse.findAll().forEach((classe)->{
           System.out.println(classe);
       });
       
    }
    
}

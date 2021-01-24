/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.test;

import dao.DaoClasse;
import dao.DaoPersonne;
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
       /*DaoClasse daoClasse=new DaoClasse();
       //Classe classe=new Classe("TTL3", 20);
       //daoClasse.insert(classe);
       daoClasse.findAll().forEach((classe)->{
           System.out.println(classe);
       });*/
       
       DaoPersonne daoPersonne=new DaoPersonne();
       Classe cl=new Classe(1);
       daoPersonne.findByClasse(cl).forEach(System.out::println);
       System.out.println(daoPersonne.findProfesseurByMatricule("MAT20212"));
       
    }
       
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mansour Djamil
 */
public class Detail {
    private String annee;
    private List<String> modules;
    //ManytoOne
    private Classe classe;
    private Professeur professeur;
    
    public Detail() {
    }

    public Detail(String annee) {
        this.annee = annee;
    }

    public Detail(String annee, List<String> modules, Classe classe, Professeur professeur) {
        this.annee = annee;
        this.modules = modules;
        this.classe = classe;
        this.professeur = professeur;
    }

    public Detail(Classe classe, Professeur professeur) {
        this.classe = classe;
        this.professeur = professeur;
    }
    
    

   
    

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    
    
}

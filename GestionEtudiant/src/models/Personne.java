/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Mansour Djamil
 */
public abstract class Personne {
    protected int id;
    protected String nomComplet;
    protected String type;
    
    
    //surcharge
    //select

    public Personne() {
    }

    public Personne(int id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }
    
    //Insert

    public Personne(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    

    //geteur setteur
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nomComplet=" + nomComplet + '}';
    }
    
    
    
}

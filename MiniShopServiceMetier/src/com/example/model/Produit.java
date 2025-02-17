package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantiteEnStock;
    private Categorie categorie;
    private double noteMoyenne;
    private List<Avis> avis;

    public Produit(String nom, String description, double prix, int quantiteEnStock, Categorie categorie) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
        this.categorie = categorie;
        this.noteMoyenne = 0.0;
        this.avis = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }
    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public double getNoteMoyenne() {
        return noteMoyenne;
    }
    public void setNoteMoyenne(double noteMoyenne) {
        this.noteMoyenne = noteMoyenne;
    }

    public List<Avis> getAvis() {
        return avis;
    }
    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }
}

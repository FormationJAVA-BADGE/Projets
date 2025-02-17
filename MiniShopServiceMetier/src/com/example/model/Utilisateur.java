package com.example.model;


import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String nom;
    private String email;
    private String adresse;
    private String telephone;
    private Panier panier;
    private List<Commande> commandes;

    public Utilisateur(String nom, String email, String adresse, String telephone) {
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.panier = new Panier();
        this.commandes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Panier getPanier() {
        return panier;
    }
    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}


package com.example.model;



import java.util.ArrayList;
import java.util.List;

public class Commande {

    private List<LigneCommande> lignes;
    private double montantTotal;
    private Statut statut;
    private Adresse adresseLivraison;
    private Utilisateur utilisateur;

    public Commande(Utilisateur utilisateur, Adresse adresseLivraison) {
        this.utilisateur = utilisateur;
        this.adresseLivraison = adresseLivraison;
        this.lignes = new ArrayList<>();
        this.statut = Statut.EN_COURS;
        this.montantTotal = 0.0;
    }

    public List<LigneCommande> getLignes() {
        return lignes;
    }
    public void setLignes(List<LigneCommande> lignes) {
        this.lignes = lignes;
    }

    public double getMontantTotal() {
        return montantTotal;
    }
    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }
    public void setAdresseLivraison(Adresse adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}


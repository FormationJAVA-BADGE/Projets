package com.example.model;

public class Avis {
    private int note; // de 1 à 5
    private String commentaire;
    private Produit produit;
    private Utilisateur utilisateur;

    public Avis(int note, String commentaire, Produit produit, Utilisateur utilisateur) {
        this.note = note;
        this.commentaire = commentaire;
        this.produit = produit;
        this.utilisateur = utilisateur;
    }

    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Produit getProduit() {
        return produit;
    }
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}

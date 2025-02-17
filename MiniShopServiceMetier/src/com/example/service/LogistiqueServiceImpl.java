package com.example.service;

import com.example.model.Categorie;
import com.example.model.Produit;

public class LogistiqueServiceImpl implements ILogistiqueService{
    @Override
    public void ajouterStock(Produit produit, int quantite) {
        produit.setQuantiteEnStock(produit.getQuantiteEnStock() + quantite);

    }

    @Override
    public Produit creerProduit(String nom, String description, double prix, int quantite, Categorie categorie) {
        return new Produit(nom, description, prix, quantite, categorie);
    }
}

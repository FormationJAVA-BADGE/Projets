package com.example.service;

import com.example.model.Categorie;
import com.example.model.Produit;

public interface ILogistiqueService {

    void ajouterStock(Produit produit, int quantite);
    Produit creerProduit(String nom, String description, double prix, int quantite, Categorie categorie);
}

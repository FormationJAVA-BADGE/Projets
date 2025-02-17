package com.example.service;

import com.example.model.Adresse;
import com.example.model.Panier;
import com.example.model.Utilisateur;

// VenteService.java
public interface IVenteService {
    boolean processSale(Panier panier, Utilisateur utilisateur, Adresse adresseLivraison);
}

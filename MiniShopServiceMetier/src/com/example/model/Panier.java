package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<LigneCommande> lignes;
    private boolean valide;

    public Panier() {
        this.lignes = new ArrayList<>();
        this.valide = false;
    }

    public List<LigneCommande> getLignes() {
        return lignes;
    }
    public void setLignes(List<LigneCommande> lignes) {
        this.lignes = lignes;
    }

    public boolean isValide() {
        return valide;
    }
    public void setValide(boolean valide) {
        this.valide = valide;
    }

    public void ajouterLigne(LigneCommande ligne) {
        this.lignes.add(ligne);
    }
}

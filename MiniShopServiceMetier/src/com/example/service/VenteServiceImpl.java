package com.example.service;

import com.example.model.*;

public class VenteServiceImpl implements IVenteService {

    @Override
    public boolean processSale(Panier panier, Utilisateur utilisateur, Adresse adresseLivraison) {

        if(!isPanierValid(panier)){
         return false;
        }

        // Tous les produits sont disponibles, procéder à la vente
        Commande commande = new Commande(utilisateur, adresseLivraison);

        // VERSION EN JAVA 7
        double total = 0;
        for (LigneCommande ligne : panier.getLignes()) {
            Produit produit = ligne.getProduit();
            int quantite = ligne.getQuantite();
            produit.setQuantiteEnStock(produit.getQuantiteEnStock() - quantite);
            commande.getLignes().add(ligne);
            total += produit.getPrix() * quantite;
        }
      //OU en JAVA 8
      double montantTotal=  panier.getLignes()
                .stream()
                .peek(
                (ligne) -> {
                    Produit produit = ligne.getProduit();
                    produit.setQuantiteEnStock(produit.getQuantiteEnStock() - ligne.getQuantite());
                }
        ).mapToDouble((ligneCommande)->ligneCommande.getProduit().getPrix() * ligneCommande.getQuantite()).sum();


        commande.setMontantTotal(total);
        utilisateur.getCommandes().add(commande);
        System.out.println("Commande créée avec succès. Montant total: " + total);
        return true;
    }


    private boolean isPanierValid(Panier panier){

        boolean guard = false;

        if(panier.isValide()){
             guard = true;
        }

        for (int i=0; i<panier.getLignes().size();i++) {
            LigneCommande ligne=panier.getLignes().get(i);
            Produit produit = ligne.getProduit();
            int quantite = ligne.getQuantite();
            if (produit.getQuantiteEnStock() < quantite) {
                System.out.println("Stock insuffisant pour " + produit.getNom());
                guard= false;
            }
        }
        return guard;
    }

}


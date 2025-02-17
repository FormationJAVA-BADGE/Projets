# Cahier des Charges - MiniShop

## Présentation
MiniShop est une plateforme de vente en ligne simplifiée qui permet à des clients d'acheter des produits et de suivre leurs commandes.

## La plateforme doit gérer

### Produit
- **Nom**
- **Description**
- **Prix**
- **Quantité en stock**
- **Catégorie**
- **Note moyenne**
- **Liste d'avis**

### Catégorie
- **Nom**
- **Description**

### Utilisateur
- **Nom**
- **Email**
- **Adresse**
- **Numéro de téléphone**
- **Panier en cours**
- **Liste des commandes passées**

### Commande
- **Liste des produits**
- **Montant total**
- **Statut** (`EN_COURS`, `EXPEDIEE`, `LIVREE`)
- **Adresse de livraison**
- **L’utilisateur qui a passé la commande**

### Avis
- **Note** (1 à 5)
- **Commentaire**
- **Référence au produit**
- **Référence à l'utilisateur**

### Statistiques
- **Meilleurs clients**
- **Moyenne des notes**

## Guide de développement

1. **Créer la classe Produit**
   - Gérer le stock
2. **Créer la classe Utilisateur**
   - Gérer le panier
   - Voir l'historique des commandes
3. **Créer la classe Commande**
   - Calculer le montant total
   - Gérer les changements de statut
4. **Créer la classe Avis**
   - Vérifier la note (entre 1 et 5)
   - Lier à un produit et un utilisateur
5. **Créer la classe Statistiques**
   - Calculer les totaux des ventes
   - Identifier les meilleurs produits


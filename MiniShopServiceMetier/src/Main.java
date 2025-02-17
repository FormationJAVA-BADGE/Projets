import com.example.model.*;
import com.example.service.ILogistiqueService;
import com.example.service.IVenteService;
import com.example.service.LogistiqueServiceImpl;
import com.example.service.VenteServiceImpl;

import java.util.ArrayList;
import java.util.List;



public class Main {
  public static void main(String[] args) {
                // Création d'une catégorie
                Categorie electronique = new Categorie("Electronique", "Produits électroniques");

                // Création du service produit et d'un produit
                ILogistiqueService logistiqueService = new LogistiqueServiceImpl();
                Produit smartphone = logistiqueService.creerProduit("Smartphone", "Dernier modèle", 699.99, 10, electronique);
                logistiqueService.ajouterStock(smartphone, 5);

                // Création d'un utilisateur
                Utilisateur utilisateur = new Utilisateur("Alice", "alice@example.com", "123 rue Exemple", "0123456789");

                // Gestion du panier : ajouter un produit avec quantité et validation du panier
                Panier panier = utilisateur.getPanier();
                panier.ajouterLigne(new LigneCommande(smartphone, 2));
                panier.setValide(true);

                // Traitement de la vente via le service de vente
                IVenteService venteService = new VenteServiceImpl();

                Adresse adresseLivraison = new Adresse("rue de la mairie", 13, "69000", "Lyon");

                boolean venteReussie = venteService.processSale(panier, utilisateur, adresseLivraison);
                if (venteReussie) {
                    System.out.println("Vente réussie pour " + smartphone.getNom());
                }

                // Création d'un avis
                Avis avis1 = new Avis(5, "Excellent produit!", smartphone, utilisateur);
                List<Avis> avisList = new ArrayList<>();
                avisList.add(avis1);
                smartphone.setAvis(avisList);

                // Calcul des statistiques : total des ventes
                List<Commande> listeCommandes = utilisateur.getCommandes();
                double totalVentes = 0;
                for (Commande c : listeCommandes) {
                    totalVentes += c.getMontantTotal();
                }

                System.out.println("Total des ventes: " + totalVentes);
            }
        }



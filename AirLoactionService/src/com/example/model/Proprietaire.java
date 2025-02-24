package com.example.model;

public class Proprietaire {
    private String nom;
    private String telephone;
    private String email;
    private List<Logement> logements;

    public Proprietaire(String nom, String telephone, String email) {
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.logements = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Logement> getLogements() {
        return logements;
    }
    public void ajouterLogement(Logement logement) {
        this.logements.add(logement);
    }
}

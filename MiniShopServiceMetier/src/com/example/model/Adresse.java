package com.example.model;

public class Adresse {

    private String nomRue;
    private int numeroRue;
    private String codePostal;
    private String ville;

    public Adresse(String nomRue, int numeroRue, String codePostal, String ville) {
        this.nomRue = nomRue;
        this.numeroRue = numeroRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}

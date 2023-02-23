package com.company.Model;

public class Film {

    private String Title;

    private String Regisseur;

    private String Genre;

    private Integer Verleihpreis;

    public Film(String title, String regisseur, String genre, Integer verleihpreis) {
        Title = title;
        Regisseur = regisseur;
        Genre = genre;
        Verleihpreis = verleihpreis;
    }


    public String getTitle() {
        return Title;
    }

    public String getRegisseur() {
        return Regisseur;
    }

    public String getGenre() {
        return Genre;
    }

    public Integer getVerleihpreis() {
        return Verleihpreis;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setRegisseur(String regisseur) {
        Regisseur = regisseur;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setVerleihpreis(Integer verleihpreis) {
        Verleihpreis = verleihpreis;
    }
}

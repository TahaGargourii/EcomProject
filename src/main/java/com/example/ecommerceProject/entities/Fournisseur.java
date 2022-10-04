package com.example.ecommerceProject.entities;


import javax.persistence.*;


@Entity

@Table(name = "Fournisseurs")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFournissur;

    private String codeFournisseur;

    public Long getIdFournissur() {
        return idFournissur;
    }

    public String getCodeFournisseur() {
        return codeFournisseur;
    }

    public String getLibelleFournisseur() {
        return libelleFournisseur;
    }

    private String libelleFournisseur;

    public void setIdFournissur(Long idFournissur) {
        this.idFournissur = idFournissur;
    }

    public void setCodeFournisseur(String codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public void setLibelleFournisseur(String libelleFournisseur) {
        this.libelleFournisseur = libelleFournisseur;
    }
}

package com.example.ecommerceProject.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Produit {


    @ManyToOne
    Stock stock;
 /*   @OneToMany
    Fournisseur fournisseur;*/
    @ManyToMany
    Set<Facture> factures;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String nom;
    private float prix;


}

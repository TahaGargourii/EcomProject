package com.example.ecommerceProject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Factures")
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")


     private long idFacture ;
    private  float montant;

    @ManyToMany
    Set<Produit> produits;

    @OneToMany
    Set<Client> clients;

}

package com.example.ecommerceProject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Clé primaire
    private String nom;
    private String prenom;
    private String email;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;


}

package com.example.ecommerceProject.repositories;

import com.example.ecommerceProject.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository <Produit , Long> {
}

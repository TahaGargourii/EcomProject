package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.Produit;
import com.example.ecommerceProject.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
public class ProduitService  {
    @Autowired

    private ProduitRepository produitRepository;


    @GetMapping("/produit")
    public List<Produit> retrieveAllProduits(){
        return produitRepository.findAll();
    }
    @PostMapping("produit")
    public void addProduit(Produit produit) {
        produitRepository.save(produit);
    }

    @GetMapping("produit/{id}")
    public Produit retrieveProduit(long id) {
        return produitRepository.findById(id).get();
    }

    @DeleteMapping ("produit/{id}")
    public void delete(long id) {
        produitRepository.deleteById(id);
    }

    @PutMapping("/produit{id}")
    public Produit updateProduit(Produit produit) {

        return produitRepository.findById(produit.getId())
                .map(Produit -> {

                    produit.setNom(produit.getNom());
                    produit.setDescription(produit.getDescription());
                    produit.setPrix(200);
                    return produitRepository.save(produit);
                }).orElseThrow();
    }}


package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.Fournisseur;
import com.example.ecommerceProject.repositories.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class FournisseurService {


    @Autowired
    private FournisseurRepository fournisseurRepository;

    @GetMapping("/")
    public List<Fournisseur> retrieveAllFournisseur() {
        return fournisseurRepository.findAll()
                ;
    }

    @PostMapping("/fournisseur /{id}")
    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @DeleteMapping("/fournisseur/{id}")
    public void deleteFournisseur(long id) {
        fournisseurRepository.deleteById(id);
    }

    @GetMapping("/fournisseur /{id}")
    public Fournisseur retrieveFournisseur(long id) {
        return fournisseurRepository.findById(id).get();
    }


}

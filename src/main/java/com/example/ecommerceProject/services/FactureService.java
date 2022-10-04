package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.Facture;
import com.example.ecommerceProject.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class FactureService {


    @Autowired
    private FactureRepository factureRepository;

    @GetMapping("/factures")
    public List<Facture> retrieveAllFacture() {
        return factureRepository.findAll();
    }

    @PostMapping("/factures/{id}")
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @DeleteMapping("/factures/{id}")
    public void deleteFacture(long id) {
        factureRepository.deleteById(id);
    }

    @GetMapping("/factures/{id}")
    public Facture retrieveFacture(long id) {
        return factureRepository.findById(id).get();
    }


}

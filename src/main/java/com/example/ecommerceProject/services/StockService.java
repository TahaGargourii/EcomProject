package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.Stock;
import com.example.ecommerceProject.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
public class StockService {
    @Autowired
    private StockRepository stockRepository;


    @GetMapping("/stock")
    public List<Stock> retrieveAllStock() {
        return stockRepository.findAll();
    }

    @PostMapping
    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @DeleteMapping({"/stock/{id}"})
    public void deleteStock(long id) {
        stockRepository.deleteById(id);
    }

    @GetMapping("/stock{id}")
    public Stock retrieveStock(long idStock) {
        return stockRepository.findById(idStock).get();
    }

}










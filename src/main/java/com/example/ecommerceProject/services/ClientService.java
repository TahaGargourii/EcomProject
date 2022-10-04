package com.example.ecommerceProject.services;

import com.example.ecommerceProject.entities.Client;
import com.example.ecommerceProject.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
@RestController
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @PutMapping("/clients/{id}")
    public Client updateClient(@RequestBody Client client, @PathVariable long id) {
        // TODO Auto-generated method stub
        Client oldClient = clientRepository.getOne(id);
        oldClient.setEmail(client.getEmail());
        return clientRepository.save(oldClient);
    }

    @GetMapping("/clients")
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }


    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable long id) {
        clientRepository.deleteById(id);
    }

    @GetMapping("/clients/{id}")
    public Client retrieveClient(@PathVariable long id) {
        return clientRepository.findById(id).get();
    }
}



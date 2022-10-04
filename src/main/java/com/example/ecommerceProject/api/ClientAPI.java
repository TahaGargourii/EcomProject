package com.example.ecommerceProject.api;
import java.util.List;


import com.example.ecommerceProject.entities.Client;
import com.example.ecommerceProject.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clients")

public class ClientAPI {
    @Autowired
    ClientService clientService;


    // http://localhost:8087/SpringRest/clients/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    @ResponseBody
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }





    @DeleteMapping("/delete-client/{id}")
    public void deleteClient(@PathVariable Long id)
    {
        this.clientService.deleteClient(id);
    }


}





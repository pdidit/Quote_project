package com.quatation.quote.controller;

import com.quatation.quote.domain.Client;
import com.quatation.quote.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/clients")
    public List<Client> getAllClients() { return clientService.getAllClients(); }

    @GetMapping(value = "/clients/{id}")
    public Optional<Client> getClient(@PathVariable Integer id) { return  clientService.getClient(id); }

}

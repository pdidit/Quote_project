package com.quatation.quote.controller;

import com.quatation.quote.domain.Client;
import com.quatation.quote.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() { return clientService.getAllClients(); }

    @GetMapping
    public Client getClient(@PathVariable Integer ID) { return  clientService.getClient(ID); }

}

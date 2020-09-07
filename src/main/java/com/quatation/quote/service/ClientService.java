package com.quatation.quote.service;

import com.quatation.quote.domain.Client;
import com.quatation.quote.repos.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() { return clientRepository.findAll(); }

    public Page<Client> getPageClient(Pageable pageable) { return clientRepository.findAll(pageable); }

    public Optional<Client> getClient(Integer ID) { return clientRepository.findById(ID); }

    public Client createClient(Client client) { return  clientRepository.saveAndFlush(client); }

    public void deleteClient(Integer ID) { clientRepository.deleteById(ID); }

    public Client updateClient(Client cLient){
        Client existingClient = clientRepository.getOne(cLient.getID());

        return clientRepository.saveAndFlush(cLient);
    }

}

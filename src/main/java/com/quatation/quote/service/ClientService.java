package com.quatation.quote.service;

import com.quatation.quote.domain.Client;
import com.quatation.quote.repos.ClientRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.lang.ref.Cleaner;
import java.util.List;

public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() { return clientRepository.findAll(); }

    public Page<Client> getPageClient(Pageable pageable) { return clientRepository.findAll(pageable); }

    public Client getClient(Integer ID) { return clientRepository.getOne(ID); }

    public Client createClient(Client client) { return  clientRepository.saveAndFlush(client); }

    public void deleteClient(Integer ID) { clientRepository.deleteById(ID); }

    public Client updateClient(Client cLient){
        Client existingClient = clientRepository.getOne(cLient.getID());

        return clientRepository.saveAndFlush(cLient);
    }

}

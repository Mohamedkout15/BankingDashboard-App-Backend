package zz.sk.bankingdashboard.Services.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;
import zz.sk.bankingdashboard.Repositories.ClientRepository;


@Slf4j
@Service
public class InterfaceClientServiceImp implements InterfaceClientService{

    @Autowired
    ClientRepository clientRepository;
    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client findclientbyid(String id){
        return clientRepository.findClientByIdClient(id);
    }
    @Override
    public Client AffecterPromesseClient(PromesseClient promesseClient, String idClient) {
        Client client = clientRepository.findClientByIdClient(idClient);
        client.setPromesseClient(promesseClient);
        return clientRepository.save(client);
    }

    @Override
    public Client AffecterDeuxiemeVisite(DeuxiemeVisite deuxiemeVisite, String idClient) {
        Client client = clientRepository.findClientByIdClient(idClient);
        client.setDeuxiemeVisite(deuxiemeVisite);
        return clientRepository.save(client);
    }

    @Override
    public Client AffecterPremiereVisite(PremiereVisite premiereVisite, String idClient) {
        Client client = clientRepository.findClientByIdClient(idClient);
        client.setPremiereVisite(premiereVisite);
        return clientRepository.save(client);
    }
}

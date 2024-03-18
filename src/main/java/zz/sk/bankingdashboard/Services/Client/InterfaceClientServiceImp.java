package zz.sk.bankingdashboard.Services.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;
import zz.sk.bankingdashboard.Repositories.*;

import java.util.Date;
import java.util.List;


@Slf4j
@Service
public class InterfaceClientServiceImp implements InterfaceClientService{

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    DeuxiemeVisiteRepository deuxiemeVisiteRepository;
    @Autowired
    PremiereVisiteRepository premiereVisiteRepository;
    @Autowired
    PromesseRepository promesseRepository;
    @Autowired
    AdresseRepository adresseRepository;
    @Override
    public Client addClient(Client client) {
        client.setPremiereVisite(null);
        client.setDeuxiemeVisite(null);
        client.setPromesseClient(null);
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client findclientbyid(String id){
        return clientRepository.findClientByIdClient(id);
    }

    @Override
    public void deleteclient(String id) {
        Client client = clientRepository.findClientByIdClient(id);
        clientRepository.delete(client);

    }

    @Override


    public Client updateclient(String id, Client updatedClient) {
        Client existingClient = clientRepository.findClientByIdClient(id);
        if (existingClient != null) {
            existingClient.setAdresse(updatedClient.getAdresse());
            existingClient.setDeuxiemeVisite(updatedClient.getDeuxiemeVisite());
            existingClient.setDomaine(updatedClient.getDomaine());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setMatriculeFiscale(updatedClient.getMatriculeFiscale());
            existingClient.setNomEntreprise(updatedClient.getNomEntreprise());
            existingClient.setNumtel(updatedClient.getNumtel());
            existingClient.setPremiereVisite(updatedClient.getPremiereVisite());
            existingClient.setPromesseClient(updatedClient.getPromesseClient());
            return clientRepository.save(existingClient);
        } else {
            return null;
        }
    }


    public Client setpremierevisite(String id , PremiereVisite premierevisite ){
        Client client = clientRepository.findClientByIdClient(id);
        if (client !=null){
            client.setPremiereVisite(premierevisite);
            return clientRepository.save(client);}
        else
            return null ;
        }


    @Override
    public Client setdeuxiemevisite(String id, DeuxiemeVisite deuxiemeVisite) {
        Client client = clientRepository.findClientByIdClient(id);
        if (client !=null){
            client.setDeuxiemeVisite(deuxiemeVisite);
            return clientRepository.save(client);}
        else
            return null ;
        }


    @Override
    public Client setpromesseclient(String id, PromesseClient promesseClient) {
        return null;
    }

    @Override
    public boolean checkid(String id) {
        Client client = clientRepository.findClientByIdClient(id);
        return client != null;
    }

    @Override
    public Client setdatedxvisite(String id, Date date) {
        Client client = clientRepository.findClientByIdClient(id);

        if (client != null) {
            if (client.getDeuxiemeVisite() != null) {
                client.getDeuxiemeVisite().setDatedxvisite(date);
                return clientRepository.save(client);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public Client setdateprvisite(String id, Date date) {
        Client client = clientRepository.findClientByIdClient(id);

        if (client != null) {
            if (client.getPremiereVisite() != null) {
                client.getPremiereVisite().setDatePrvisite(date);
                return clientRepository.save(client);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}





package zz.sk.bankingdashboard.Services.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;
import zz.sk.bankingdashboard.Repositories.ClientRepository;
import zz.sk.bankingdashboard.Repositories.DeuxiemeVisiteRepository;
import zz.sk.bankingdashboard.Repositories.PremiereVisiteRepository;
import zz.sk.bankingdashboard.Repositories.PromesseRepository;

import java.util.Date;


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
    @Override
    public Client addClient(Client client) {
        client.getDeuxiemeVisite().setDatedxvisite(null);
        client.getPremiereVisite().setDatePrvisite(null);
        client.getDeuxiemeVisite().attvaldxv(null,null,null,null,null,null);
        client.getPremiereVisite().attvalprv(null,null,null,null,null,null);
        client.getPromesseClient().attprc(null,null,null,null,null,null);
        return clientRepository.save(client);
    }

    public Client findclientbyid(String id){
        return clientRepository.findClientByIdClient(id);
    }

    public Client updateclient(String id){
        Client client = clientRepository.findClientByIdClient(id);
        if (client !=null) {
            return clientRepository.save(client);
        }
        else return null;
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





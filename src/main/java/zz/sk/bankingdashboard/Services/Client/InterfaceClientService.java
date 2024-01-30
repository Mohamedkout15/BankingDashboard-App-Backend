package zz.sk.bankingdashboard.Services.Client;



import org.springframework.stereotype.Service;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;

import java.util.List;
import java.util.Map;


@Service
public interface InterfaceClientService {


    public Client addClient(Client client);

    public Client findclientbyid(String id);

    public Client AffecterDeuxiemeVisite(DeuxiemeVisite deuxiemeVisite,String idClient);

    public Client AffecterPremiereVisite(PremiereVisite premiereVisite, String idClient);

    public Client AffecterPromesseClient(PromesseClient promesseClient, String idClient);


}

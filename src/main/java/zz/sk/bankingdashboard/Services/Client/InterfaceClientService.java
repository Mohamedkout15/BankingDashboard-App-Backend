package zz.sk.bankingdashboard.Services.Client;



import org.springframework.stereotype.Service;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public interface InterfaceClientService {


    public Client addClient(Client client);

    public Client findclientbyid(String id);

    public Client updateclient(String id);

    public Client setpremierevisite(String id,PremiereVisite premierevisite);

    public Client setdeuxiemevisite(String id,DeuxiemeVisite deuxiemeVisite);

    public Client setpromesseclient(String id , PromesseClient promesseClient);


    public Client setdatedxvisite(String id , Date date);
    public Client setdateprvisite(String id , Date date);


}

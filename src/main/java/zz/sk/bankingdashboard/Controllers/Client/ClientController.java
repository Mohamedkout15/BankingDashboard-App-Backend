package zz.sk.bankingdashboard.Controllers.Client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;
import zz.sk.bankingdashboard.Repositories.ClientRepository;
import zz.sk.bankingdashboard.Services.Client.InterfaceClientService;
import java.util.Date;


@RestController
@Component
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {


    @Autowired
    InterfaceClientService demoservice ;
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/addclient")
    public Client addclient(@RequestBody Client client) {
        return demoservice.addClient(client);
    }

    @GetMapping("/findclient/{id}")
    public Client findclientbyid(@PathVariable String id){
        return demoservice.findclientbyid(id);
    }

    @PostMapping("/setdatedxvisite/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setdatedxvisite(@PathVariable String id,
                                  @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return demoservice.setdatedxvisite(id, date);
    }
    @PostMapping("/setdateprvisite/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setdateprvisite(@PathVariable String id,
                                  @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return demoservice.setdateprvisite(id, date);
    }

    @PostMapping("/setvalprv/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setvalprv(@PathVariable String id,
                            @RequestParam("n1")Number n1,Number n2,Number n3,Number n4,Number n5,Number n6){
        Client client = clientRepository.findClientByIdClient(id);
        client.getPremiereVisite().attvalprv(n1,n2,n3,n4,n5,n6);
        return clientRepository.save(client);
    }
    @PostMapping("/setvaldxv/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setvaldxv(@PathVariable String id,
                            @RequestParam("n1")Number n1,Number n2,Number n3,Number n4,Number n5,Number n6){
        Client client = clientRepository.findClientByIdClient(id);
        client.getDeuxiemeVisite().attvaldxv(n1,n2,n3,n4,n5,n6);
        return clientRepository.save(client);
    }
    @PostMapping("/setvalprc/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setprc(@PathVariable String id,
                            @RequestParam("n1")Number n1,Number n2,Number n3,Number n4,Number n5,Number n6){
        Client client = clientRepository.findClientByIdClient(id);
        client.getPromesseClient().attprc(n1,n2,n3,n4,n5,n6);
        return clientRepository.save(client);
    }

    @PostMapping("/setdeuxiemevisite/{id}")
    public Client setdeuxiemevisite(@PathVariable String id ,
                                    @RequestParam("deuxiemevisite")DeuxiemeVisite deuxiemeVisite){
        return demoservice.setdeuxiemevisite(id, deuxiemeVisite);
    }
    @PostMapping("/setpremierevisite/{id}")
    public Client setpremierevisite(@PathVariable String id ,
                                    @RequestParam("premierevisite") PremiereVisite premierevisite){
        return demoservice.setpremierevisite(id, premierevisite);
    }
    @PostMapping("/setpromesseclient/{id}")
    public Client setpromesseclient(@PathVariable String id ,
                                    @RequestParam("promesseclient") PromesseClient promesseClient){
        return demoservice.setpromesseclient(id, promesseClient);
    }


}

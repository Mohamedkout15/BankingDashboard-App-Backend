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
import zz.sk.bankingdashboard.Repositories.DeuxiemeVisiteRepository;
import zz.sk.bankingdashboard.Repositories.PremiereVisiteRepository;
import zz.sk.bankingdashboard.Repositories.PromesseRepository;
import zz.sk.bankingdashboard.Services.Client.InterfaceClientService;
import java.util.Date;
import java.util.List;


@RestController
@Component
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {


    @Autowired
    InterfaceClientService demoservice ;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PremiereVisiteRepository premiereVisiteRepository;
    @Autowired
    private DeuxiemeVisiteRepository deuxiemeVisiteRepository;
    @Autowired
    private PromesseRepository promesseRepository;

    @PostMapping("/addclient")
    public Client addclient(@RequestBody Client client)
    {
        return demoservice.addClient(client);
    }

    @GetMapping("/findclient/{id}")
    public Client findclientbyid(@PathVariable String id)
    {
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
    public Client setvalprv(@PathVariable String id, @RequestBody List<Number> numbers) {
        Client client = clientRepository.findClientByIdClient(id);
        PremiereVisite premiereVisite = client.getPremiereVisite();
        if (numbers.size() == 6) {
            premiereVisite.attvalprv(
                    numbers.get(0),
                    numbers.get(1),
                    numbers.get(2),
                    numbers.get(3),
                    numbers.get(4),
                    numbers.get(5)
            );
        }
        premiereVisiteRepository.save(premiereVisite);
        return clientRepository.save(client);
    }


    @PostMapping("/setvaldxv/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setvaldxv(@PathVariable String id
                            , @RequestBody List<Number> numbers){
        Client client = clientRepository.findClientByIdClient(id);
        DeuxiemeVisite deuxiemeVisite = client.getDeuxiemeVisite();
        if (numbers.size() == 6) {
            deuxiemeVisite.attvaldxv(
                    numbers.get(0),
                    numbers.get(1),
                    numbers.get(2),
                    numbers.get(3),
                    numbers.get(4),
                    numbers.get(5)
            );
        }
        deuxiemeVisiteRepository.save(deuxiemeVisite);
        return clientRepository.save(client);
    }
    @PostMapping("/setvalprc/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Client setprc(@PathVariable String id
                        ,@RequestBody List<Number> numbers)
    {
        Client client = clientRepository.findClientByIdClient(id);
        PromesseClient promesseClient = client.getPromesseClient();
        if (numbers.size() == 6) {
            promesseClient.attprc(
                    numbers.get(0),
                    numbers.get(1),
                    numbers.get(2),
                    numbers.get(3),
                    numbers.get(4),
                    numbers.get(5)
            );
        }
        promesseRepository.save(promesseClient);
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
    @GetMapping("/checkid/{id}")
    public boolean checkid
            (@PathVariable String id){
        return demoservice.checkid(id);
    }
}

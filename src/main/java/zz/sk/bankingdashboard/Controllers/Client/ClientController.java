package zz.sk.bankingdashboard.Controllers.Client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Entities.DeuxiemeVisite;
import zz.sk.bankingdashboard.Entities.PremiereVisite;
import zz.sk.bankingdashboard.Entities.PromesseClient;
import zz.sk.bankingdashboard.Services.Client.InterfaceClientService;

import javax.ws.rs.QueryParam;
import java.util.Date;


@RestController
@Component
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {


    @Autowired
    InterfaceClientService demoservice ;

    @PostMapping("/addclient")
    public Client addclient(@RequestBody Client client) {
        return demoservice.addClient(client);
    }

    @GetMapping("/findclient/{id}")
    public Client findclientbyid(@PathVariable String id){
        return demoservice.findclientbyid(id);
    }

    @PostMapping("/setdatedxvisite/{id}")
    public Client setdatedxvisite(@PathVariable String id,
                                  @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return demoservice.setdatedxvisite(id, date);
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

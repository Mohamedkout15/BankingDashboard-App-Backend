package zz.sk.bankingdashboard.Controllers.Client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import zz.sk.bankingdashboard.Entities.Client;
import zz.sk.bankingdashboard.Services.Client.InterfaceClientService;

import javax.ws.rs.QueryParam;
import java.util.Date;


@RestController
@Component
@RequestMapping("/client")
@CrossOrigin(origins = "http://localhost:4200") // Add your Angular app's origin
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


}

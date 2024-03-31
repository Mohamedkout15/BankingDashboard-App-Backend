package zz.sk.bankingdashboard;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import static zz.sk.bankingdashboard.user.Role.ADMIN;
import static zz.sk.bankingdashboard.user.Role.MANAGER;

import zz.sk.bankingdashboard.Configuration.Security.auth.AuthenticationService;
import zz.sk.bankingdashboard.Configuration.Security.auth.RegisterRequest;

@SpringBootApplication
@EntityScan(basePackages = {"zz.sk.bankingdashboard.Entities","zz.sk.bankingdashboard.user","zz.sk.bankingdashboard.Configuration.Security.token"})
@ComponentScan(basePackages = {"zz.sk.bankingdashboard.Controllers", "zz.sk.bankingdashboard.Configuration","zz.sk.bankingdashboard.Repositories","zz.sk.bankingdashboard.Services"})
public class BankingDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingDashboardApplication.class, args);
    }

   /* @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Hammadi")
                    .lastname("Hmeda")
                    .email("Hammadi@test.zz")
                    .password("hammadi123")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());


        };*/
    }

